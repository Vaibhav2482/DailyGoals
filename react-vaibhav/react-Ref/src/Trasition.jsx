import { useState, useTransition } from "react"
import { useFormState } from "react-dom"

function Transition(){
  const [pending, setTransition] = useTransition();


  const handleSubmit=()=>{
    setTransition(async()=>{
     await new Promise((res)=>setTimeout(res,3000));
    })
  }
  return(
    <div>
    <h1>Transition in React JS</h1>
    {
      pending?
      <img style={{width:20}} src="https://media.tenor.com/khzZ7-YSJW4AAAAM/cargando.gif" alt="" />
      :null
    }
    <button onClick={handleSubmit}disabled={pending}>Submit</button>
    </div>
  )
}
export default Transition;