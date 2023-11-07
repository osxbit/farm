from attrs import define


@define
class CameraObject:
    width: float
    height: float
    scale: float
    rotation: float


@define
class GenericAquarium(CameraObject):
    center_coord_x: float
    center_coord_y: float


@define
class AnalyzedAnimal:
    x_pos: float
    y_pos: float


@define
class Fish(AnalyzedAnimal):
    shape = ""
    width: float
    height: float


class ImageProcessor:
    def fix_aquarium_rotation(self):
        # implementation
        return

    def fix_background(self):
        # impl
        return

    def overlapping_area(self):
        # impl
        return

    def redraw_layout(self):
        # impl
        return

    def exec_analysis(self):
        # impl
        return

    def get_instance(self):
        # impl
        return


class OutputBuilder:
    def apply_heatmap(self):
        # impl
        return

    def assemble_frames(self):
        # impl
        return

    def output_video(self):
        # impl
        return

    def get_instance(self):
        # impl
        return


class CvController:
    def __init__(self):
        processor = ImageProcessor
        build = OutputBuilder

        processor.get_instance()
        build.get_instance()
