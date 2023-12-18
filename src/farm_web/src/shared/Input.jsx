function Input(params){
  return (
    <>
      <label for={params.id} className="checkboxes-label">
        { params.name }
      </label>
      <input
        className="checkbox-farm"
        type="checkbox"
        id={ params.id }
        checked={ params.checked }
        onChange={ params.onChange } />  
    </>
  )
}

export default Input