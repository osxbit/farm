import cv2
from av import VideoFrame
from farm.agent.orchestration import OrchestrationHandler


class CvTransform(OrchestrationHandler):
    async def process(self, *args, **kwargs):
        frame: VideoFrame = await self.feeders[0].get()

        image = frame.to_ndarray(format="bgr24")

        transform_offset = self.node.settings.get("translate", [0, 0])
        transform_scale = self.node.settings.get("scale", 1)
        transform_rotation = self.node.settings.get("rotate", 0)

        if (
            transform_offset[0] != 0
            or transform_offset[1] != 0
            or transform_scale != 1
            or transform_rotation != 0
        ):
            frame_dimensions = [sum(dim) for dim in zip(image.shape, transform_offset)]
            frame_center = (frame_dimensions[0] / 2, frame_dimensions[1] / 2)
            transform_matrix = cv2.getRotationMatrix2D(
                frame_center,
                transform_rotation,
                transform_scale,
            )

            transform_matrix[0][2] += transform_offset[0]
            transform_matrix[1][2] += transform_offset[1]

            image = cv2.warpAffine(image, transform_matrix, frame_dimensions)

        new_frame = VideoFrame.from_ndarray(image, format="bgr24")
        new_frame.pts = frame.pts
        new_frame.time_base = frame.time_base

        self.queue.push(new_frame)
