import logging
from pathlib import Path
from typing import Any, Callable, Dict, Iterator, List, Optional, Tuple, Union
from uuid import uuid4

import msgspec
from attr import Factory, define, field

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
        normal_tree = {}
        selected_node = None
        for order, node in enumerate(self.nodes):
            if node.ignored:
                continue
            normal_tree[node.uid] = node, order
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

        if not self._unreferenced_nodes(normal_tree, reversed_tree, logger=logger):
            raise ValueError("The configuration contains unreferenced nodes")

        terminator_nodes = normal_tree - reversed_tree.keys()

        return {
            "terminator_nodes": terminator_nodes,
            "tree": normal_tree,
            "selected_node": selected_node,
        }
        print(terminator_nodes)  # noqa: T201


class TributaryTreeBuilder:
    def __init__(self, node: OrchestrationNode) -> None:
        pass


class OrchestrationLink:
    def __init__(self):
        pass

    def kill(self):
        pass


class OrchestrationHandler:
    def __init__(self, function: Callable, *args, **kwargs) -> None:
        self.function = function
        self.args = args
        self.kwargs = kwargs


class OrchestrationMaster:
    def __init__(
        self,
        configuration: OrchestrationContext,
        logger: Optional[logging.Logger] = None,
    ) -> None:
        self.logger = logger or logging.getLogger("farm:agent:orchestration")
        self.configuration = configuration

    def prepare_source(self, node: OrchestrationNode):
        pass

    def bind_source(self, track):
        self.source_track = track
        self.source_track.recv()

    def prepare_tributary(self, node: OrchestrationNode):
        pass

    async def recv(self):
        pass

    def prepare(self):
        for node in self.configuration.nodes:
            if node.ignored:
                continue
            if not node.feeders:
                self.prepare_source(node)

    def process(self):
        pass


if __name__ == "__main__":
    context = OrchestrationContext.load("farm-compose.yml")
    context.analyze_configuration()
