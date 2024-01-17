from collections import UserDict
from dataclasses import dataclass


class Parameters(UserDict):
    def __init__(self, *args, **kwargs):
        super().__init__(*args, **kwargs)

    def __getattr__(self, key):
        return self.data[key]

    def __setattr__(self, key, value):
        self.data[key] = value


@dataclass
class AlgorithmDirective:
    name: str
    ptype: str
    features: list[str]


class AlgorithmDescription:
    def __init__(self, name: str, parameters: Parameters):
        self.name = name
        self.parameters = parameters


class ProcessorAlgorithm:
    def __init__(self, parameters: Parameters):
        self.parameters = parameters

    def process(self, frame):
        return frame


class ProcessorAlgorithmFactory:
    def __init__(self, algorithm: AlgorithmDescription):
        self.algorithm = algorithm

    def create(self) -> ProcessorAlgorithm:
        return ProcessorAlgorithm(self.algorithm.parameters)
