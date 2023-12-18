import { createSignal } from "solid-js"
import AlgSettings from "./AlgSettings";

function Statistics() {
  
  const [ switchShow, setSwitchShow ] =  createSignal(true)
  const [statistics, setStatistics] = createSignal([
    { label: "Total sensors", value: 10 },
    { label: "Total length the fish swam", value: 75 },
    { label: "Total time spend(seconds) in container A", value: 1000 },
    { label: "Total time spend(seconds) in container B", value: 20000 },
  ]);

  const handleShow = () => {
    setSwitchShow(!switchShow())
  }

  return (
    <>
      {switchShow() ? 
        <>
          <div className="statistics-header">
            <h2>Statistics</h2>
          </div>
          <div className="statistics-content">
            {statistics().length > 0 && statistics().map((statistic, index) => (
              <div className="statistic-box" key={index}>
                <h4>{ statistic.label }</h4>
                <p>{ statistic.value }</p>
              </div>
            ))}
          </div>
        </>
        :
        <>
          <AlgSettings />
        </>
      }
      <div className="statistics-export">
        <button className='button-farm' onClick={() => handleShow()}>Toggle Show</button>
      </div>
    </>
  )
}

export default Statistics
