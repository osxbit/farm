function Select(params) {
  return (
    <>
      <label className="enum-label" for={`${params.name}`}>{params.name}: </label>
      <select class="form-select" id={`${params.name}`} >
        <option selected>Open this select menu</option>
        {params.options.length > 0 && params.options.map((option, index) => (
          <option 
            value={option}
            key={index}>
            {option}
          </option>
        ))}
      </select>
    </>
  )
}

export default Select
