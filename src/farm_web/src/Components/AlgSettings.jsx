import { createSignal } from "solid-js"
import Input from "../shared/Input"
import NumberInput from "../shared/NumberInput"
import Select from "../shared/Select"

function AlgSettings() {
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
    </div>
  )
}

export default AlgSettings
