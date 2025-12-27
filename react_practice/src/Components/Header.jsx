import { Link } from "react-router-dom";
import "./Header.css";

function Header() {
  return (
    <header className="header">
      <h2>Daily Goals</h2>

      <nav>
        <Link to="/">Home</Link>
        <Link to="/counter">Counter</Link>
        <Link to="/toggle">Toggle</Link>
        <Link to="/form">Form</Link>
      </nav>
    </header>
  );
}

export default Header;
