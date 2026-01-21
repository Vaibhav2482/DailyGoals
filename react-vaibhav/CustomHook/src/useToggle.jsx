import { useState } from "react";

const useToggle = (defaultval) => {
const [value, setValue] = useState(defaultval);

function toggleVal(val) {
  if(typeof val != 'boolean'){
    setValue(!value);
  }else {
    setValue(val);
  }
}
return[value, toggleVal];
}

export default useToggle;
