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

  const onSubmit = async (event) => {
    event.preventDefault();

    try {
      const response = await fetch('http://localhost:5000/send_request', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify({
          videoPath: videoPath(),
          configPath: configPath(),
        }),
      });

      if (!response.ok) {
        throw new Error('Network response was not ok');
      }

      const responseData = await response.json();
      console.log('Response:', responseData);
    } catch (error) {
      console.error('Error:', error.message);
    }
  };


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
          <button type="submit" onClick={onSubmit}>Submit</button>
        </div>
      </div>
    </div>
  )
}

export default AlgSettings
