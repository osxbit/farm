import InputRadio from "./InputRadio"

function RadioSelection(params) {
  return (
    <>
      {params.options !== null && params.options.map((option, index) => {
        return (
          <InputRadio
            key={index}
            id={index}
            text={option}
            radio_name={params.name}
            onChange={ params.onChange }
            checked={index == 0}
            value={`${index == 0 ? "true" : "false"}`}
          />
        )
      })}
   </>
  )

}

export default RadioSelection