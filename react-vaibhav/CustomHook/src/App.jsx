import useToggle from './useToggle'

const App = () => {
  const [value, setvalue] = useToggle(true);
  return (
    <div>
      <h1>Custom hooks in react js </h1>
      <button onClick={setvalue}>Toggle Heading</button>
      <button onClick={()=>setvalue(true)} >Show Heading</button>
      <button onClick={()=>setvalue(false)} >Hide Heading</button>
      {
        value? <h1>This Heading will toggle or hide or show</h1> : null
      }
    </div>
  )
}

export default App
