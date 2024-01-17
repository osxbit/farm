import asyncio
from typing import Any, List, Optional


class MulticastQueueItem:
    data: Any
    next_item: Optional["MulticastQueueItem"] = None

    def __init__(
        self, data: Any, next_item: Optional["MulticastQueueItem"] = None
    ) -> None:
        self.data = data
        self.next_item = next_item or None


class MulticastQueueSubscription:
    def __init__(self, queue: "MulticastQueue") -> None:
        self.current = queue.current
        self.event = asyncio.Event()

    def notify(self):
        self.event.set()

    def __aiter__(self):
        return self

    async def get(self):
        if self.current.next_item is None:
            await self.event.wait()

        self.event.clear()
        self.current = self.current.next_item
        return self.current.data

    async def __anext__(self):
        return await self.get()


class MulticastQueue:
    def __init__(self, *items, data: Optional[List[Any]] = None) -> None:
        items = list(items)
        items.extend(data or [])
        self.subscribers: List[MulticastQueueSubscription] = []

        self.current = MulticastQueueItem(None)
        for item in items:
            self.push(item)

    def subscribe(self) -> MulticastQueueSubscription:
        subscription = MulticastQueueSubscription(self)
        self.subscribers.append(subscription)
        return subscription

    def unsubscribe(self, subscription: MulticastQueueSubscription) -> None:
        subscription.current = MulticastQueueItem(None)
        self.subscribers.remove(subscription)

    def notify(self):
        for subscriber in self.subscribers:
            subscriber.notify()

    def push_all(self, items: List[Any], notify: bool = True):
        for item in items:
            self.push(item, notify=False)

        if notify:
            self.notify()

    def push(self, item: Any, notify: bool = True):
        self.current.next_item = MulticastQueueItem(item)
        self.current = self.current.next_item
        if notify:
            self.notify()


if __name__ == "__main__":

    async def producer(queue: MulticastQueue):
        counter = 0
        while True:
            await asyncio.sleep(1)
            queue.push(f"JOB-{counter}")
            counter += 1

    async def consumer1(queue: MulticastQueueSubscription):
        async for item in queue:
            print(f"$$$ {item}")

    async def consumer2(queue: MulticastQueueSubscription):
        async for item in queue:
            print(f"&&& {item}")

    async def main():
        queue = MulticastQueue()
        subscription1 = queue.subscribe()
        subscription2 = queue.subscribe()

        await asyncio.gather(
            producer(queue),
            consumer1(subscription1),
            consumer2(subscription2),
        )

    asyncio.run(main())
