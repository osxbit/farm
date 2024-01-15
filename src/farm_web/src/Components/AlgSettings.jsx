import { createSignal } from "solid-js"
import Input from "../shared/Input"
import NumberInput from "../shared/NumberInput"
import Select from "../shared/Select"

function AlgSettings() {
  const [ videoPath, setVideoPath] = createSignal('')
  const [ configPath, setConfigPath] = createSignal('')
  const [ numberData, setNumberData ] = createSignal([])
  const [ enumData, setEnumData ] = createSignal([])
  const [ checkboxData, setCheckboxData ] = createSignal([])
  const [ parameters, setParameters ] = createSignal({
    "rotate": {
      "type": "Number",
      "name": "Rotate",
      "extra": {
          "max": 385,
          "min": 0,
      }
    },
    "degrees": {
      "type": "Number",
      "name": "Degrees",
      "extra": {
          "max": 385,
          "min": 0,
      }
    },
    "path": {
      "type": "Enum",
      "name": "Path",
      "extra": {
          "values": ["A", "B", "C"],
      }
    },
    "flag": {
      "type": "CheckBox",
      "name": 'Flag',
    },
  })

  const onVideoChangePath = (event) => {
    setVideoPath(event.target.value)
  }
  const onConfigChangePath = (event) => {
    setConfigPath(event.target.value)
  }

  var pc = null;

const negotiate = (videoPath, configPath) => {
    pc.addTransceiver('video', {direction: 'recvonly'});
    pc.addTransceiver('audio', {direction: 'recvonly'});
    return pc.createOffer().then(function(offer) {
        return pc.setLocalDescription(offer);
    }).then(function() {
        // wait for ICE gathering to complete
        return new Promise(function(resolve) {
            if (pc.iceGatheringState === 'complete') {
                resolve();
            } else {
                function checkState() {
                    if (pc.iceGatheringState === 'complete') {
                        pc.removeEventListener('icegatheringstatechange', checkState);
                        resolve();
                    }
                }
                pc.addEventListener('icegatheringstatechange', checkState);
            }
        });
    }).then(function() {
        var offer = pc.localDescription;
        return fetch('http://localhost:4321/offer', {
            body: JSON.stringify({
                sdp: offer.sdp,
                type: offer.type,
                videoPath: videoPath,
                configPath: configPath,
            }),
            headers: {
              'Content-Type': 'application/json'
            },
            method: 'POST'
        });
    }).then(function(response) {
        return response.json();
    }).then(function(answer) {
        return pc.setRemoteDescription(answer);
    }).catch(function(e) {
        alert(e);
    });
}

const start = () => {
    console.log('BUNA ZIUIA')
    var config = {
        sdpSemantics: 'unified-plan'
    };

    pc = new RTCPeerConnection(config);

    // connect audio / video
    pc.addEventListener('track', function(evt) {
        if (evt.track.kind == 'video') {
          document.getElementById('video').srcObject = evt.streams[0];
        } else {
          document.getElementById('audio').srcObject = evt.streams[0];
        }
    });

    negotiate(videoPath, configPath);
  }


  Object.entries(parameters()).forEach(([key, value]) => {
    switch (value.type) {
      case "Number":
        setNumberData((prevData) => [ ...prevData, { [key]: value }])
        break;
      case "Enum":
        setEnumData((prevData) => [ ...prevData, { [key]: value }])
        break;
      case "CheckBox":
        setCheckboxData((prevData) => [ ...prevData, { [key]: value }]);
        break;
      default:
        break;
    }
  })

  return (
    <div className="dinamically-container">
      <div className="dinamically-header">
        <h2>More Settings</h2>
      </div>
      <div className="number-container">
        {numberData().length > 0 && numberData().map((parameter, index) => {
          const [key, value] = Object.entries(parameter)[0]

          return (
            <div className="number-property">
              <NumberInput
               key={index}
               name={value.name}
               maxValue={value.extra.max}
               minValue={value.extra.min}
               placeHolder="Enter rotation value" />
            </div>
          )
        })}
      </div>
      <div className="enum-container">
        {enumData().length > 0 && enumData().map((parameter, index) => {
          const [key, value] = Object.entries(parameter)[0]

          return (
            <div className="enum-property">
              <Select 
                key={index}
                name={value.name}
                options={value.extra.values}
              />
            </div>
          )
        })}
      </div>
      <div className="checkboxes-container">
        {checkboxData().length > 0 && checkboxData().map((parameter, index) => {
          const [key, value] = Object.entries(parameter)[0]

          return (
            <div className="checkboxes-property">
              <Input
                id={index}
                key={index}
                checked={false}
                name={value.name}
              />
            </div>
          )
        })}
      </div>
      <div className="delimitator"></div>
      <div className="integration">
        <div className="input-file">
          <label className="label-for-file" for="video-path">Video Path</label>
          <input 
            type="text" 
            id="video-path"
            value={videoPath()}
            onChange={ onVideoChangePath }
          />
        </div>
        <div className="input-file">
          <label className="label-for-file" for="config-path">Config Path</label>
          <input 
            type="text" 
            id="config-path"
            value={configPath()}
            onChange={ onConfigChangePath }
          />
        </div>
        <div className="submit-button">
          <button type="submit" onClick={start}>Submit</button>
        </div>
      </div>
    </div>
  )
}

export default AlgSettings
