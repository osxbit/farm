from attrs import define

"""
https://pdm-project.org/latest/

ruff

(Invoke-WebRequest -Uri https://pdm-project.org/install-pdm.py -UseBasicParsing).Content | python -


"""

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

@define
class ImageProcessor:
    def fix_aquarium_rotation():
        # implementation
        return

    def fix_background():
        # impl
        return

    def overlapping_area():
        # impl
        return

    def redraw_layout():
        # impl
        return

    def exec_analysis():
        # impl
        return

    def get_instance():
        # impl
        return

@define
class OutputBuilder():
    def apply_heatmap():
        # impl
        return

    def assemble_frames():
        # impl
        return

    def output_video():
        # impl
        return

    def get_instance():
        # impl
        return

@define
class CvController:
    processor = ImageProcessor
    build = OutputBuilder

    processor.get_instance()
    build.get_instance()