function FileInput(params) {
  return (
    <>
      <input 
        class="file-farm-input" 
        type="file" 
        id="formFile"
        onChange={ (event) => params.onChange(event.target.files[0]) }>
      </input>
    </>
  )
}

export default FileInput
