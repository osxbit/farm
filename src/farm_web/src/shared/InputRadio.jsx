function InputRadio(params){

  return (
      <div className="form-input">
        <input
          className="radio-farm"
          type="radio"
          id={ params.id }
          name={ params.radio_name }
          checked={ params.checked }
          onChange={ params.onChange }
          value={ params.value } />
        <p className="checkbox-label-farm">
          { params.text }
        </p>
      </div>
    )
  }
  
  export default InputRadio
