import {useState} from "react";

function FormHandling(){
   const [name,setName]= useState("");
   const [email,setEmail]= useState("");

   const handleSubmit=(e)=>{
        e.preventDefault();
        console.log("Name:", name);
        console.log("Email:", email);
   }
   const handleReset=()=>{
        setName("");
        setEmail("");
   };
    return(
        <>
            <h2>Form Handling Component</h2>

            <form onSubmit={handleSubmit}>
            <input 
            type="text"
            placeholder="name"
            value={name}
            onChange={
                (e)=>setName(e.target.value)
            }
            />
            <input 
            type="email"
            placeholder="email"
            value={email}
            onChange={(e)=>setEmail(e.target.value)}
            />
            <button type="submit">Submit</button>
            <button type="button" onClick={handleReset}>Reset</button>
            </form>
        </>

        
    );
}
export default FormHandling;
