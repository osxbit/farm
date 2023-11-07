#cred ca v ati prins oricum ce e aici, am facut o clasa factory care creeaza diferite tipuri de instante in functie de tipul dat

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

