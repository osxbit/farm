
import cv2
import base64
from flask import Flask, render_template
from flask_socketio import SocketIO

class VideoStream:
    def stream(self):
        pass

class RTSPStream(VideoStream):
    def stream(self):
        print("Streaming via RTSP")


class HTTPStream(VideoStream):
    def stream(self):
        print("Streaming via HTTP")

class StreamFactory:
    def create_stream(self, stream_type):
        if stream_type == "RTSP":
            return RTSPStream()
        elif stream_type == "HTTP":
            return HTTPStream()
        else:
            return None
        
stream_factory = StreamFactory()
rtspStream = stream_factory.create_stream("RTSP")
rtspStream.stream()

httpStream = stream_factory.create_stream("HTTP")
httpStream.stream()

app = Flask(__name__)
socketio = SocketIO(app)

camera = cv2.VideoCapture(0)

@socketio.on('image')

def send_image():
    while True:
        success, frame = camera.read()
        if success:
            _, buffer = cv2.imencode('.jpg', frame)
            frame_encoded = base64.b64encode(buffer).decode('utf-8')
            socketio.emit('image_response', frame_encoded)

@app.route('/')
def index():
    return render_template('index.html')

if __name__ == "__main__":
    socketio.run(app)

