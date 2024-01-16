import logging

from aiohttp import web
from aiortc import MediaStreamTrack, RTCPeerConnection, RTCSessionDescription
from aiortc.contrib.media import MediaPlayer

from farm.agent.orchestration import OrchestrationContext, OrchestrationMaster

agent_router = web.RouteTableDef()


class SingletonMeta(type):
    _instance = None

    def __call__(cls, *args, **kwargs):
        if cls._instance is None:
            cls._instance = super().__call__(*args, **kwargs)
        return cls._instance


class StreamControllerWarehouse(meta=SingletonMeta):
    def __init__(self):
        self._stream_controller = None

    async def get_stream_controller(self):
        if self._stream_controller is None:
            self._stream_controller = await setup_streaming()
        return self._stream_controller


class StreamProcessorTrack(MediaStreamTrack):
    kind = "video"

    def __init__(self, track, processor: OrchestrationMaster):
        super().__init__()
        self.track = track
        self.processor = processor
        self.processor.bind_source(self, track)

    async def recv(self):
        return await self.processor.recv()


class StreamController:
    connections: list[RTCPeerConnection]

    def __init__(self, logger=None):
        self._streaming = False
        self.connections = []
        self.logger = logger or logging.getLogger("farm:agent:stream-controller")

    async def start_streaming(self):
        self._streaming = True

    async def stop_streaming(self):
        self._streaming = False

    async def is_streaming(self):
        return self._streaming

    def setup_track(self, track):
        self.track: StreamProcessorTrack = track

    def setup_source(self, source, **kwargs):
        player = MediaPlayer(source, **kwargs)
        self.source_track = player.video

    def setup_context(self, context: str):
        self.processing_context = OrchestrationContext.load(context)
        self.processing_master = OrchestrationMaster(self.processing_context)

    def bind_rtc_connection(self, rtc_connection):
        self.connections.append(rtc_connection)

        @rtc_connection.on("track")
        def on_track(track):
            self.logger.info("Track %s received", track.kind)

            if track.kind == "video":
                rtc_connection.addTrack(self.track)

            @track.on("ended")
            async def on_ended():
                self.logger.info("Track %s ended", track.kind)
                await rtc_connection.close()

        @rtc_connection.on("connectionstatechange")
        async def on_connection_state_change():
            self.logger.info("Connection state is %s", rtc_connection.connectionState)
            if rtc_connection.connectionState == "failed":
                await rtc_connection.close()
                self.connections.remove(rtc_connection)


async def setup_streaming():
    controller = StreamController()
    return controller


@agent_router.get("/stream/connect")
async def connect_streaming(request: web.Request):
    connection_parameters = await request.json()

    rtc_description = RTCSessionDescription(
        spd=connection_parameters["sdp"], type=connection_parameters["type"]
    )

    rtc_connection = RTCPeerConnection()
    # bind with controller

    rtc_connection.setRemoteDescription(rtc_description)
    # start streaming

    rtc_response = await rtc_connection.createAnswer()
    await rtc_connection.setLocalDescription(rtc_response)

    return web.json_response(
        {
            "sdp": rtc_connection.localDescription.sdp,
            "type": rtc_connection.localDescription.type,
        }
    )


async def start_streaming(request: web.Request):
    controller = request.app["stream_controller"]
    await controller.start_streaming()
    return web.json_response({"status": "ok"})
