from farm.core.types import Parameters


class Artefact:
    def __init__(self, parameters: Parameters):
        self.parameters = parameters

    def draw(self, canvas):
        pass
