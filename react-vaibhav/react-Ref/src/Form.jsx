import { useFormStatus } from 'react-dom';
function Form(){
  function SubmitButton() {
    const { pending } = useFormStatus();
    
    return (
      <button type="submit" disabled={pending}>
        {pending ? "Submitting..." : "Submit"}
      </button>
    );
  }
    const handleSubmit = async (event) => { 
    console.log("Form data:", event);
    await new Promise(res => setTimeout(res, 2000));
    console.log("form submitting");
  };

  return (
    <div>
      <form action={handleSubmit}>
        <input
          type="email" 
          name="email"
          placeholder="Enter Email" 
        />
        <br />
        <br />
        <input 
          type="password" 
          name="password"
          placeholder="Enter Password" 
        />
        <br />
        <br />
        <SubmitButton />
      </form>
    </div>
  )
}
export default Form