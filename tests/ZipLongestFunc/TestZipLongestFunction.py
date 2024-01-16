import unittest

from farm.core.productive import zip_longest

class TestZipLongestFunction(unittest.TestCase):
    def test_basic_example(self):
        result = list(zip_longest('ABCD', 'xy', fillvalue='-'))
        expected = [('A', 'x'), ('B', 'y'), ('C', '-'), ('D', '-')]
        self.assertEqual(result, expected)

    def test_empty_iterables(self):
        result = list(zip_longest([], [], fillvalue='*'))
        expected = []
        self.assertEqual(result, expected)

    def test_different_lengths(self):
        result = list(zip_longest('123', 'abcde', 'xyz', fillvalue='*'))
        expected = [('1', 'a', 'x'), ('2', 'b', 'y'), ('3', 'c', 'z'), ('*', 'd', '*'), ('*', 'e', '*')]
        self.assertEqual(result, expected)

    def test_fillvalue_none(self):
        result = list(zip_longest('ABCD', 'xy'))
        expected = [('A', 'x'), ('B', 'y'), ('C', None), ('D', None)]
        self.assertEqual(result, expected)

    def test_fillvalue_custom_object(self):
        result = list(zip_longest('AB', 'xyz', fillvalue={'default': True}))
        expected = [('A', 'x'), ('B', 'y'), ({'default': True}, 'z')]
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()
