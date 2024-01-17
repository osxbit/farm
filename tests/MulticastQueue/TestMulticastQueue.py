import asyncio
import unittest

from farm.core.collections import MulticastQueue


class TestMulticastQueue(unittest.IsolatedAsyncioTestCase):
    async def test_queue_operations(self):
        queue = MulticastQueue()

        # Test basic push and subscribe
        subscription = queue.subscribe()
        queue.push("Test 1")
        result = await subscription.get()
        self.assertEqual(result, "Test 1")

        # Test push_all and multiple subscribers
        subscription2 = queue.subscribe()
        queue.push_all(["Test 2", "Test 3"])
        result1 = await subscription.get()
        result2 = await subscription2.get()
        self.assertEqual(result1, "Test 2")
        self.assertEqual(result2, "Test 2")

        # Test unsubscribe
        queue.unsubscribe(subscription)
        queue.push("Test 4")
        with self.assertRaises(asyncio.TimeoutError):
            await asyncio.wait_for(subscription.get(), timeout=1)

    async def test_notifications(self):
        queue = MulticastQueue()
        subscription1 = queue.subscribe()
        subscription2 = queue.subscribe()

        # Test notifications
        queue.push("Test 1")
        result1 = await subscription1.get()
        result2 = await subscription2.get()
        self.assertEqual(result1, "Test 1")
        self.assertEqual(result2, "Test 1")

        # Test notifications after unsubscribe
        queue.unsubscribe(subscription1)
        queue.push("Test 2")
        with self.assertRaises(asyncio.TimeoutError):
            await asyncio.wait_for(subscription1.get(), timeout=1)
        result2 = await subscription2.get()
        self.assertEqual(result2, "Test 2")

    async def test_producer_consumer(self):
        queue = MulticastQueue()
        subscription1 = queue.subscribe()
        subscription2 = queue.subscribe()

        # Test producer and consumers
        async def producer():
            queue.push_all(["Test 1", "Test 2"])

        async def consumer(subscription, expected_results):
            results = []
            async for item in subscription:
                results.append(item)
                if len(results) == len(expected_results):
                    break
            self.assertEqual(results, expected_results)

        await asyncio.gather(
            producer(),
            consumer(subscription1, ["Test 1", "Test 2"]),
            consumer(subscription2, ["Test 1", "Test 2"]),
        )


if __name__ == "__main__":
    unittest.main()
