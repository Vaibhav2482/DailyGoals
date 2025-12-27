import "./App.css";
import HomeComponent from "./Components/HomeComponent";
import CounterComponent from "./Components/CounterComponent";
import ToggleComponent from "./Components/ToggleComponent";
import { Route, Routes } from "react-router-dom";
import FormHandling from "./Components/FormHandling";

function App() {
  return (
    <>
    <Routes>
      <Route path="/" element={<HomeComponent />} />
      <Route path="/counter" element={<CounterComponent />} />
      <Route path="/toggle" element={<ToggleComponent />} />
      <Route path="/form" element={<FormHandling />} />


    </Routes>
    </>
  );
}

export default App;
