import { useState } from "react";
import "./ToggleComponent.css";

function ToggleComponent() {
  const [show, setShow] = useState(false);

  return (
    <div className="toggle-container">
      <button
        className="toggle-btn"
        onClick={() => setShow(!show)}
      >
        {show ? "Hide" : "Show"}
      </button>

      {show && <p className="toggle-text">This content is toggled</p>}
    </div>
  );
}

export default ToggleComponent;
