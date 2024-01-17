import { createSignal } from 'solid-js'
import './App.scss'
import Settings from './Components/Settings'
import Layout from './components/Layout'

function App() {

  const [ fishSettings, setFishSettings ] = createSignal({
    'f_highlight': false, 
    'f_heatmap': false, 
    'f_movement': false,
    'scale_percent': 0,
    'split_image': true,
    'ss_build': true,
    'save_dataset': true,
    'path_to_recording': '',
  })

  return (
    <div className="farm-project">
      <div className="settings">
        <div className="settings-container">
          <Settings
            fishSettings = {fishSettings()}
            setFishSettings = {setFishSettings}
          />
        </div>
      </div>
      <div className="layout">
        <div className="layout-container">
          <Layout
            fishSettings = {fishSettings()}
            setFishSettins = {setFishSettings}
          />
        </div>
      </div>
    </div>
  )
}

export default App
