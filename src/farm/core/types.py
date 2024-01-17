from collections import UserDict


class Parameters(UserDict):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def __getattr__(self, key):
        return self.data[key]

    def __setattr__(self, key, value):
        self.data[key] = value
