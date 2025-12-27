import React,{useState} from "react";
function CounterComponent(){
    const [count, setCount] = useState(0);

    return(
        <>
            <h2>This is Counter Component</h2>
            <h3>Count {count}</h3>
            <button onClick={()=>setCount(count+1)}> Increment</button>
            <button onClick={()=>setCount(count-1)}> Decrement</button>
        </>
    );
}
export default CounterComponent;
