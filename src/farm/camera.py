from pathlib import Path

import cv2
from cv2.typing import MatLike

WHITE = [255, 255, 255]
resurces = Path(__file__).parent / "resurces"

face_cascade = cv2.CascadeClassifier(
    (resurces / "haarcascade_frontalcatface.xml").as_posix()
)
eye_cascade = cv2.CascadeClassifier((resurces / "haarcascade_eye.xml").as_posix())


def draw_box(image: MatLike, x, y, w, h):
    cv2.line(image, (x, y), (x + int(w / 5), y), WHITE, 2)
    cv2.line(image, (x + int((w / 5) * 4), y), (x + w, y), WHITE, 2)
    cv2.line(image, (x, y), (x, y + int(h / 5)), WHITE, 2)
    cv2.line(image, (x + w, y), (x + w, y + int(h / 5)), WHITE, 2)
    cv2.line(image, (x, (y + int(h / 5 * 4))), (x, y + h), WHITE, 2)
    cv2.line(image, (x, (y + h)), (x + int(w / 5), y + h), WHITE, 2)
    cv2.line(image, (x + int((w / 5) * 4), y + h), (x + w, y + h), WHITE, 2)
    cv2.line(image, (x + w, (y + int(h / 5 * 4))), (x + w, y + h), WHITE, 2)


class VideoCamera(object):
    def __init__(self):
        self.video = cv2.VideoCapture(0)

    def __del__(self):
        self.video.release()

    def get_frame(self) -> bytes:
        success, image = self.video.read()
        # We are using Motion JPEG, but OpenCV defaults to capture raw images,
        # so we must encode it into JPEG in order to correctly display the
        # video stream.

        gray = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
        faces = face_cascade.detectMultiScale(gray, 1.3, 5)
        for x, y, w, h in faces:
            gray_face = cv2.resize((gray[y : y + h, x : x + w]), (110, 110))
            eyes = eye_cascade.detectMultiScale(gray_face)
            for ex, ey, ew, eh in eyes:
                draw_box(gray, x, y, w, h)

        ret, jpeg = cv2.imencode(".jpg", gray)

        return jpeg.tobytes()
