import React from "react";
import Home from "./Components/Home";
import About from "./Components/About";
import Contact from "./Components/Contacts";
import { Route, Routes, Link } from "react-router-dom";

function App() {
  return (
    <div>
      <nav className="navbar navbar-expand-lg bg-primary">
        <div className="container-fluid" >
          <Link to="/Usernavbar" className="navbar-brand">Premium Parking Service</Link>
          <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse justify-content-center" id="navbarNavDropdown">
            <ul className="navbar-nav">
              <li className="nav-item">
                <Link to="/Home" className="nav-link active text-light" aria-current="page">Home</Link>
              </li>
              <li className="nav-item">
                <Link to="/About" className="nav-link text-light mr-4">About</Link>
              </li>
              <li className="nav-item">
                <Link to="/Contact" className="nav-link text-light mr-4">Contact</Link>
              </li>
              <li className="nav-item">
                <Link to="#" className="nav-link text-light mr-4">SignOut</Link>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <Routes>
        <Route exact path="/" element={<Home />} />
        <Route exact path="/Home" element={<Home />} />
        <Route exact path="/Contact" element={<Contact />} />
        <Route exact path="/About" element={<About />} />
      </Routes>

    </div >
  );
}

export default App;
