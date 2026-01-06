import { useState } from "react"

function Users(){
  const [users, setusers]= useState([]);
  const [user, setuser] = useState("");
  const handleAddUser=()=>{
    setusers([...users,user])
  }
  const total = users.length;
  const lastUser = users[users.length-1];
  const Unique = [...new Set (users)].length;
  return(
    <div>
      <h3>Total Users : {total}</h3>
      <h3>Last User : {lastUser}</h3>
      <h3>Unique USer : {Unique}</h3>
    <h1>Handling Users in React</h1>
    <input type="text" placeholder="Add user" onChange={(event)=>setuser(event.target.value)}/>
    <button onClick={handleAddUser}>Add User</button>
    {
      users.map((item,index)=>(
        <h3 key={index} >{item}</h3>
      ))
    }
    </div>
  )
}
export default Users;