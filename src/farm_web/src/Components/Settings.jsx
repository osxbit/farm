import Input from '../shared/Input'
import RadioSelection from '../shared/RadioSelection'
import FileInput from '../shared/FileInput'

function Settings(props) {
  const options = [ "Show all images on the same Window", "Show each image in a separate Window" ]
  const agreeList = ["Yes", "No"]


  const setSettingChange = (clause, event) => {
    props.setFishSettings({...props.fishSettings, [clause]: event.target.checked})
  }

  const setSettingRadio = (clause, event) => {
    props.setFishSettings({...props.fishSettings, [clause]: event.target.value == 'true'})
  }

  const setSettingFile = (clause, event) => {
    props.setFishSettings({...props.fishSettings, [clause]: file ? file.name : ''})
  }

  return (
    <>
      <div className="settings-header">
        <h2>Settings</h2>
      </div>
      <div className="settings-body">
        <div className="setting">
          <h4>Realtime Image Selection</h4>
          <div className="checkboxes-container">
            <Input
              name={ "Fish Hightlight" }
              id={ "fishHighlight" }
              checked={ props.fishSettings['f_highlight'] }
              onChange={ (event) => setSettingChange('f_highlight', event)} 
            />
          </div>
          <div className="checkboxes-container">
            <Input
              name={ "Fish HeatMap" }
              id={ "fishHeatmap" }
              checked={ props.fishSettings['f_heatmap'] }
              onChange={ (event) => setSettingChange('f_heatmap', event)} 
            />
          </div>
          <div className="checkboxes-container">
            <Input
              name={ "Fish Movement" }
              id={ "fishMovement" }
              checked={ props.fishSettings['f_movement'] }
              onChange={ (event) => setSettingChange('f_movement', event)} 
            />
          </div>
        </div>
        <div className="setting">
          <h4>Split or merge images?</h4>
          <RadioSelection
            name="splitImage"
            options={ options }
            onChange={ (event) => setSettingRadio('split_image', event) }
          />
        </div>
        <div className="setting">
          <h4>Build Screenshots with the last image state?</h4>
          <RadioSelection
            name="ss"
            options={ agreeList }
            onChange={ (event) => setSettingRadio('ss_build', event) }
          />
        </div>
        <div className="setting">
          <h4>Save numerical datasets?</h4>
          <RadioSelection
            name="dataset"
            options={ agreeList }
            onChange={ (event) => setSettingRadio('save_dataset', event) }
          />
        </div>
        <div className="setting">
          <h4>Select Recording</h4>
          <FileInput
            name="file-upload"
            onChange={ (file) => setSettingFile('path_to_recording', file) }
          />
        </div>
      </div>
      <div className="settings-footer">
        <button className='button-farm'>Start Monitoring</button>
        <button className='button-farm'>Save Config</button>
      </div>
    </>
  )
}

export default Settings
