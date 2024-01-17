import itertools


def zip_longest(*args, fillvalue=None):
    """
    Make an iterator that aggregates elements from each of the input iterables.
    If the iterables are of uneven length, missing values are filled with the fillvalue.

    Args:
        *args: Variable number of iterables to be zipped together.
        fillvalue: Value used to fill missing values when the iterables are of
            uneven length.

    Returns:
        An iterator that yields tuples containing elements from each of the
            input iterables.

    Examples:
        >>> list(zip_longest('ABCD', 'xy', fillvalue='-'))
        [('A', 'x'), ('B', 'y'), ('C', '-'), ('D', '-')]
    """
    iterators = [iter(it) for it in args]
    num_active = len(iterators)
    if not num_active:
        return
    while True:
        values = []
        for i, it in enumerate(iterators):
            try:
                value = next(it)
            except StopIteration:
                num_active -= 1
                if not num_active:
                    return
                iterators[i] = itertools.repeat(fillvalue)
                value = fillvalue
            values.append(value)
        yield tuple(values)
