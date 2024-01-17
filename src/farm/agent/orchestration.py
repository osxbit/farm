import asyncio
import logging
from abc import abstractmethod
from pathlib import Path
from typing import Any, Callable, Dict, Iterator, List, Optional, Tuple, Union
from uuid import uuid4

import msgspec
from attr import Factory, define, field

from farm.core.collections import MulticastQueue, MulticastQueueSubscription
from farm.core.productive import zip_longest


@define
class OrchestrationNode:
    target: str
    dependencies: List[str]
    feeders: List[str]
    settings: dict[str, Any]
    uid: str = field(default=Factory(lambda: uuid4().hex))
    selected: bool = field(default=False)
    ignored: bool = field(default=False)


@define
class OrchestrationContext:
    nodes: List[OrchestrationNode]
    selected_node: str

    @classmethod
    def build(cls, data: Union[List[Dict], Dict]):
        """
        Build an orchestration object from the given data.

        Args:
            data (Union[List[Dict], Dict]): The data representing the orchestration.

        Returns:
            cls: An instance of the orchestration class.

        """
        last_node_id = "source"
        processed_nodes = []
        data_iter: Iterator[Tuple[Optional[str], OrchestrationNode]] = (
            data.items()
            if isinstance(data, dict)
            else zip_longest(data, fillvalue=None)
        )

        for node_id, node in data_iter:
            if not node.get("feeders", None):
                node["feeders"] = [last_node_id]

            node["uid"] = node_id or node.get("id", None) or uuid4().hex
            last_node_id = node["uid"]

            processed_nodes.append(
                msgspec.convert(node, OrchestrationNode, strict=False)
            )
        return cls(nodes=processed_nodes, selected_node=last_node_id)

    @classmethod
    def load(cls, file: Union[str, Path]):
        """
        Load the orchestration from the given file.

        Args:
            file (str): The file to load the orchestration from.

        Returns:
            OrchestrationContext: The loaded orchestration.
        """
        yaml_data = msgspec.yaml.decode(Path(file).read_text())
        return cls.build(yaml_data.get("nodes", {}))

    def _unreferenced_nodes(
        self,
        normal_tree: dict[str, OrchestrationNode],
        reversed_tree: dict[str, list[str]],
        logger: logging.Logger,
    ):
        unreferenced_nodes = reversed_tree.keys() - normal_tree.keys() - {"source"}
        if not unreferenced_nodes:
            return True

        for node in unreferenced_nodes:
            logger.warning(
                "The referenced nodes is not defined: %s in %s",
                node,
                ",".join(
                    [
                        "%s (%s)" % (normal_tree[ref][0].uid, normal_tree[ref][1])
                        for ref in reversed_tree[node]
                    ]
                ),
            )
            affected_nodes = reversed_tree.pop(node)
            for node_ref in affected_nodes:
                normal_tree[node_ref][0].feeders.remove(node)
                if normal_tree[node_ref][0].feeders:
                    continue
                _, order = normal_tree.pop(node_ref)
                logger.warning(
                    "The node %s (%s) is not referenced anymore and will be removed",
                    node_ref,
                    order,
                )

        return True

    def analyze_configuration(self, logger: Optional[logging.Logger] = None):
        """Analyzes the configuration of the agent's orchestration.

        Args:
            logger (Optional[logging.Logger]): The logger to use for logging
                messages. If not provided, a default logger will be used.

        Raises:
            ValueError: If the configuration contains unreferenced nodes.
        """
        logger = logger or logging.getLogger("farm:agent:orchestration")
        reversed_tree = {}
        nodes_map = {}
        selected_node = None
        for order, node in enumerate(self.nodes):
            if node.ignored:
                continue
            nodes_map[node.uid] = node, order
            if not selected_node and node.selected:
                selected_node = node.uid
            elif selected_node and node.selected:
                logger.warning(
                    "The node %s (%s) is selected but %s is already selected",
                    node.uid,
                    order,
                    selected_node,
                )
            for feeder in node.feeders:
                if feeder not in reversed_tree:
                    reversed_tree[feeder] = []
                reversed_tree[feeder].append(node.uid)

        if not self._unreferenced_nodes(nodes_map, reversed_tree, logger=logger):
            raise ValueError("The configuration contains unreferenced nodes")

        terminator_nodes = nodes_map - reversed_tree.keys()

        return {
            "nodes-end": terminator_nodes,
            "nodes-map": nodes_map,
            "node-selected": selected_node,
        }


class OrchestrationFunctionLoader:
    def __init__(self, node: OrchestrationNode) -> None:
        self.orchestration_node = node

    def load(self):
        import importlib

        module_name, function_name = self.orchestration_node.target.rsplit(".", 1)
        module = importlib.import_module(module_name)
        self.function = getattr(module, function_name)
        return self.function


class OrchestrationHandler:
    node: OrchestrationNode
    queue: MulticastQueue
    feeders: List[MulticastQueueSubscription]

    def __init__(
        self,
        node: OrchestrationNode,
        feeders: Optional[List[MulticastQueueSubscription]] = None,
    ) -> None:
        self.node = node
        self.process = OrchestrationFunctionLoader(node).load().process
        self.queue = MulticastQueue()
        self.feeders = feeders or []

    @abstractmethod
    async def process(self, *args, **kwargs):
        raise NotImplementedError()

    async def __call__(self, *args, **kwargs):
        return await self.process(self, *args, **kwargs)


class MulticastQueueSourceSubscription:
    def __init__(self, queue: "MulticastQueueSource") -> None:
        self.track = queue.track

    def __aiter__(self):
        return self

    async def get(self):
        return await self.track.recv()

    async def __anext__(self):
        return await self.get()


class MulticastQueueSource:
    def __init__(self, track) -> None:
        self.track = track

    def subscribe(self):
        return MulticastQueueSourceSubscription(self)

    def unsubscribe(self, subscription: MulticastQueueSourceSubscription) -> None:
        pass


class OrchestrationContextPreparer:
    def __init__(self, obj: "OrchestrationMaster") -> None:
        self.obj = obj

    def prepare(self):
        analysis = self.obj.configuration.analyze_configuration()
        nodes_map: Dict[str, OrchestrationNode] = analysis["nodes-map"]
        nodes_end = analysis["nodes-end"]
        selected_node = analysis["node-selected"]

        left_nodes = nodes_map.keys() - nodes_end
        order_list = list(nodes_end)
        while left_nodes:
            for node in left_nodes:
                if nodes_map[node][0].feeders in order_list:
                    order_list.append(node)
                    left_nodes.remove(node)
                    break

        for node_id in reversed(order_list):
            node, _ = nodes_map[node_id]
            if node.ignored:
                continue

            feeders = [
                self.obj.data_handlers[node].queue.subscribe() for node in node.feeders
            ]
            handler = OrchestrationHandler(node, feeders=feeders)
            self.obj.data_handlers[node_id] = handler

        selected_node = (
            selected_node or self.obj.configuration.selected_node or "source"
        )

        self.obj.select_node(selected_node)


class OrchestrationMaster:
    def __init__(
        self,
        configuration: OrchestrationContext,
        logger: Optional[logging.Logger] = None,
    ) -> None:
        self.logger = logger or logging.getLogger("farm:agent:orchestration")
        self.configuration = configuration
        self.data_handlers: Dict[str, OrchestrationHandler] = {}
        self.data_coroutines: Dict[str, Callable] = {}
        self.data_out_feed: MulticastQueueSourceSubscription = None
        self.state = "stopped"
        # self.prepare()

    def bind_source(self, track):
        self.data_handlers["source"] = type(
            "SourceHandler",
            (OrchestrationHandler,),
            {
                "queue": MulticastQueueSource(track),
            },
        )

    def select_node(self, node_id: str):
        self.configuration.selected_node = node_id
        self.data_out_feed = self.data_handlers[node_id].queue.subscribe()

    async def recv(self):
        if not self.data_out_feed:
            self.data_out_feed = self.data_feeds["source"].subscribe()

        if self.state == "stopped":
            await self.process()

        frame = await self.data_out_feed.get()
        return frame

    def prepare(self):
        OrchestrationContextPreparer(self).prepare()

    async def process_loop(self):
        while True:
            await asyncio.gather(
                *[
                    handler()
                    for h_name, handler in self.data_handlers.items()
                    if h_name != "source"
                ]
            )

    async def process(self):
        self.loop_coroutine = asyncio.create_task(self.process_loop())
        self.state = "started"


if __name__ == "__main__":
    context = OrchestrationContext.load("farm-compose.yml")
    context.analyze_configuration()
