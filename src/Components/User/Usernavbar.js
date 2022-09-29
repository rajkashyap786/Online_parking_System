import React from "react";
import Viewparkingplace from "./Viewparkingplace"
import SlotBooking from "./SlotBooking";
import { Route, Routes, Link } from "react-router-dom";

function Usernavbar() {
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
                                <Link to="/Usernavbar/Viewparkingplace" className="nav-link active text-light" aria-current="page">Viewparkingplace</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/Usernavbar/SlotBooking" className="nav-link text-light mr-4">SlotBooking</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="#" className="nav-link text-light mr-4">SignOut</Link>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>

            <Routes>
                <Route exact path="/Usernavbar" element={<Viewparkingplace />} />
                <Route exact path="/Usernavbar/Home" element={<Viewparkingplace />} />
                <Route exact path="/Usernavbar/Contact" element={<SlotBooking />} />
                {/* <Route exact path="/Usernavbar/About" element={<Payment />} /> */}
            </Routes>

        </div >
    );
}

export default Usernavbar;
