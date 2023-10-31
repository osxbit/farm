import abc
import enum

from typing import List

from attrs import define


@define
class Position:
    x: int
    y: int


class SensorType(enum.Enum):
    time = enum.auto()
    speed = enum.auto()
    heatmap = enum.auto()
    counter = enum.auto()
    distance = enum.auto()
    movement = enum.auto()


class BaseSensorProcessor(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def process(self, frame: List[Position], config: dict):
        pass


@define
class Sensor:
    name: str
    description: str
    position: Position
    type: SensorType
    activation: List[BaseSensorProcessor]
