from typing import List

from attrs import define

from farm_tool.core.models.sensors import Sensor


@define
class InputStreamConfig:
    rotation: int
    fps: int


@define
class Scenario:
    name: str
    input_config: InputStreamConfig
    sensors: List[Sensor]
