function NumberInput(params) {
  return (
    <>
      <label className="number-label" for={`${params.name}`}>{params.name}: </label>
      <input 
        type="number"
        id={`${params.name}`} 
        name={`${params.name}`} 
        min={params.minValue}
        max={params.maxValue}
        className="number-input" >
      </input>
    </>
  )
}

export default NumberInput