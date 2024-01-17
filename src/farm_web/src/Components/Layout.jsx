import Sensors from "./Sensors"
import SensorsList from "./SensorsList"
import Statistics from "./Statistics"

function Layout(props) {
  return (
    <>
      <div className="sensors">
        <div className="sensors-determination">
          <Sensors />
        </div>
        <div className="sensors-list">
          <SensorsList />
        </div>
      </div>
      <div className="statistics">
        <Statistics />
      </div>
    </>
  )
}

export default Layout
