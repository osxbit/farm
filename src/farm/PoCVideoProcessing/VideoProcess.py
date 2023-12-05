from abc import ABC, abstractmethod
import numpy as np
import cv2
from collections import UserDict

# from SensorControl import SensorControl


class AlgorthmParams(UserDict):
    def __getattr__(self, name):
        return self[name]


class Solver:
    def __init__(self, fname):
        self.fname = fname

    # def __init__(self, controls, gui, fname, split, scale, sensor_ctrl):
    #     self.controls = controls
    #     self.gui = gui
    #     self.fname = fname
    #     self.split = split
    #     self.scale_percent = scale
    #     self.sensor_ctrl = sensor_ctrl

    def function(self):
        pass

    def solve(self):
        self.video_cap: cv2.VideoCapture = cv2.VideoCapture(self.fname)
        self.fps: float = self.video_cap.get(cv2.CAP_PROP_FPS)
        frame_count: int = 2
        trace: list = []
        success, img1 = self.video_cap.read()
        width: int = img1.shape[0]
        height: int = img1.shape[1]
        heat_map: np.ndarray = np.zeros([img1.shape[0] + 120, img1.shape[1] - 165])
        frame_count += 1
        while True:
            # self.gui.root.update()
            # self.gui.root.update_idletasks()

            # extractie frame curent
            success, frame = self.video_cap.read()
            if not success:
                break
            # rotim acvariul sub forma de T
            w_offset_1, h_offset_1 = -30, -20
            w_offset_2, h_offset_2 = -15, 0
            h, w = frame.shape[0] + w_offset_1, frame.shape[1] + h_offset_1
            center = w / 2, h / 2

            firstobj = FundalAcvariuAlg()
            secondobj = RotatieAcvariuAlg(
                frame, center, -3, 1.2, w_offset_1, h_offset_1, w, h
            )
            incadrare = secondobj.process()
            thirdobj = RotatieAcvariuAlg(
                incadrare, center, -69, 1, w_offset_2, h_offset_2, h + 50, h + 130
            )
            incadrare2 = thirdobj.process()
            forthobj = ReDrawLayoutAlg(incadrare2, width, height)
            objlist = [firstobj, secondobj, thirdobj, forthobj]

            for algobj in objlist:
                algobj.process()

            background: np.ndarray = cv2.cvtColor(firstobj, cv2.COLOR_BGR2GRAY)
            gray: np.ndarray = cv2.cvtColor(thirdobj, cv2.COLOR_BGR2GRAY)
            frame_diff: np.ndarray = cv2.absdiff(gray, background)
            ret, thres = cv2.threshold(frame_diff, 17, 255, cv2.THRESH_BINARY)

            # cautam si desenam suprafetele si anulam pe cele ffff mici sau fff mari
            # (pestele are aria patratului circumscris intre 70 si 200)
            contours, hierarchy = cv2.findContours(
                thres, cv2.RETR_TREE, cv2.CHAIN_APPROX_SIMPLE
            )
            for contour in contours:
                if cv2.contourArea(contour) < 30 or cv2.contourArea(contour) > 1000:
                    continue
                (x, y, w, h) = cv2.boundingRect(contour)
                cv2.circle(thirdobj, (x + w // 2, y + h // 2), 10, (0, 255, 0), -1)
                trace += [(x + w // 2, y + h // 2)]

            # Constructie HeatMap aferenta miscarii pestelui
            heat_map[np.all(thirdobj == [0, 255, 0], 2)] += 1
            heat_map[heat_map < 0] = 0
            heat_map[heat_map > 255] = 255
            cv2.applyColorMap(heat_map.astype("uint8"), cv2.COLORMAP_JET)

            # Constructie trace miscare
            if len(trace) > 1:
                px2 = trace[-1]
                px1 = trace[-2]
                cv2.line(firstobj, px1, px2, (128, 255, 128), 1)
                # inceput

        ##finalll
        self.video_cap.release()
        cv2.destroyAllWindows()


class AlgorithmBase(ABC):
    params = {}

    @abstractmethod
    def process(self):
        pass


class FundalAcvariuAlg(AlgorithmBase):
    def __init__(self, **kwargs):
        self.params: AlgorthmParams = AlgorthmParams(kwargs)

    def process(self):
        cap: cv2.VideoCapture = cv2.VideoCapture(self.params.fname)
        frame_indices: np.ndarray = cap.get(
            cv2.CAP_PROP_FRAME_COUNT
        ) * np.random.uniform(size=50)
        frames: list = []
        for idx in frame_indices:
            cap.set(cv2.CAP_PROP_POS_FRAMES, idx)
            ret, frame = cap.read()
            w_offset_1, h_offset_1 = -30, -20
            w_offset_2, h_offset_2 = -15, 0
            h, w = frame.shape[0] + w_offset_1, frame.shape[1] + h_offset_1
            center = w / 2, h / 2
            rotatie_acvariu_obj_inc = RotatieAcvariuAlg(
                frame, center, -3, 1.2, w_offset_1, h_offset_1, w, h
            )
            incadrare: np.ndarray = rotatie_acvariu_obj_inc.process()
            # incadrare = self.Rotatie_Acvariu(
            #     frame, center, -3, 1.2, w_offset_1, h_offset_1, w, h
            # )
            rotatie_acvariu_obj_rot = RotatieAcvariuAlg(
                incadrare, center, -69, 1, w_offset_2, h_offset_2, h + 50, h + 130
            )
            rotated: np.ndarray = rotatie_acvariu_obj_rot.process()
            # rotated = self.Rotatie_Acvariu(
            #     incadrare, center, -69, 1, w_offset_2, h_offset_2, h + 50, h + 130
            # )
            frames.append(rotated)
        median_frame: np.ndarray = np.median(frames, axis=0).astype(np.uint8)
        return median_frame


class RotatieAcvariuAlg(AlgorithmBase):
    def __init__(self, **kwargs):
        self.params: AlgorthmParams = AlgorthmParams(kwargs)

    def process(self):
        m: np.ndarray = cv2.getRotationMatrix2D(
            self.params.center, self.params.unghi, self.params.scale
        )
        m[0][2] += self.params.woff
        m[1][2] += self.params.hoff
        rotated: np.ndarray = cv2.warpAffine(
            self.params.frame,
            m,
            (self.params.w - self.params.woff, self.params.h - self.params.hoff + 20),
        )
        return rotated


class OverlappAreaAlg(AlgorithmBase):
    def __init__(self, **kwargs):
        self.params: AlgorthmParams = AlgorthmParams(kwargs)

    def process(self):
        x, y, w, h = (
            int(self.startx),
            int(self.starty),
            int(self.width),
            int(self.height),
        )
        blk: np.ndarray = np.ones(self.img.shape, np.uint8) * 255
        cv2.rectangle(
            blk,
            (int(self.startx), int(self.starty)),
            (int(self.startx + self.width), int(self.starty + self.height)),
            self.color,
            cv2.FILLED,
        )
        out: np.ndarray = cv2.addWeighted(self.img, 1.0, blk, 0.25, 1)
        self.img[y : y + h, x : x + w] = out[y : y + h, x : x + w]


class ReDrawLayoutAlg(AlgorithmBase):
    def __init__(self, **kwargs):
        self.params: AlgorthmParams = AlgorthmParams(kwargs)

    def process(self):
        colors = [
            (245, 245, 220),
            (164, 211, 238),
            (193, 255, 193),
            (255, 225, 255),
            (0, 191, 255),
            (0, 205, 102),
            (255, 20, 147),
            (148, 0, 211),
            (128, 128, 0),
        ]

        actual_width: int = self.width
        actual_height: int = self.height

        # h_l = len(self.controls.area_sizes_hor_e)
        # v_l = len(self.controls.area_sizes_ver_e)

        factorx: float = actual_width / 5
        actual_width = factorx * 5

        start_x_left: float = (self.width - factorx * 5) / 2 + 20
        start_x_center_left: float = self.width / 2 - factorx / 2 + 10

        start_y_top: int = 15
        start_y_top_hor: int = 139
        start_y_top_vert: int = start_y_top_hor + 110

        actual_height = self.height - start_y_top_vert - 20

        # caseta invalida din varf
        overlapp_area_obj = OverlappAreaAlg(
            self.img, start_x_center_left, start_y_top, factorx, 124, (255, 255, 255)
        )
        overlapp_area_obj.process()

        i: int = 0
        last_x: float = start_x_left
        for h in self.controls.area_sizes_hor_e:
            data: str = h.get()
            if data[-1] == "%":
                per: int = int(data[:-1])
            else:
                per: int = int(data)
            overlapp_area_obj = OverlappAreaAlg(
                self.img,
                last_x,
                start_y_top_hor,
                (per / 100) * actual_width,
                110,
                colors[i],
            )
            overlapp_area_obj.process()
            cv2.putText(
                self.img,
                chr(ord("A") + i),
                (
                    int(last_x + (per / 100) * actual_width / 2),
                    int(start_y_top_hor + 110 / 2),
                ),
                cv2.FONT_HERSHEY_SIMPLEX,
                1,
                (255, 255, 255),
                1,
                cv2.LINE_AA,
            )
            key: str = chr(ord("A") + i)
            self.compartiments[key] = {
                "x_top": last_x,
                "y_top": start_y_top_hor,
                "width": (per / 100) * actual_width,
                "height": 110,
                "orientation": 0,
            }
            last_x += (per / 100) * actual_width
            i += 1

        j: int = i
        i: int = 0
        last_y: int = start_y_top_vert
        for v in self.controls.area_sizes_ver_e:
            data: str = v.get()
            if data[-1] == "%":
                per: int = int(data[:-1])
            else:
                per: int = int(data)
            overlapp_area_obj = OverlappAreaAlg(
                self.img,
                start_x_center_left,
                last_y,
                factorx,
                (per / 100) * actual_height,
                colors[j],
            )
            overlapp_area_obj.process()
            cv2.putText(
                self.img,
                chr(ord("A") + j),
                (
                    int(start_x_center_left + factorx / 2),
                    int(last_y + (per / 100) * actual_height / 2),
                ),
                cv2.FONT_HERSHEY_SIMPLEX,
                1,
                (255, 255, 255),
                1,
                cv2.LINE_AA,
            )
            key: str = chr(ord("A") + j)
            self.compartiments[key] = {
                "x_top": start_x_center_left,
                "y_top": last_y,
                "width": factorx,
                "height": (per / 100) * actual_height,
                "orientation": 1,
            }
            last_y += (per / 100) * actual_height
            i += 1
            j += 1

        # afisare grafica a senzorilor, cu display in timp real pe senzor
        # self.ReDrawSensors(C)


if __name__ == "__main__":
    solver = Solver(
        "C:\\Users\\secon\\Downloads\\wetransfer_recordings_2023-12-04_0935\\Recordings\\2Agresivitate.mpg"
    )
    solver.solve()
