import React from "react";

import View from "./View";
import BookingDetails from "./BookingDetails";
import Activities from "./Activities";
import { Route, Routes, Link } from "react-router-dom";
import RegisterParkingSpace from "./RegisterParkingSpace";

function Adminnavbar() {
    return (
        <div>
            <nav className="navbar navbar-expand-lg bg-primary">
                <div className="container-fluid" >
                    <Link to="/Dashboard" className="navbar-brand">Premium Parking Service</Link>
                    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <div className="collapse navbar-collapse justify-content-center" id="navbarNavDropdown">
                        <ul className="navbar-nav">
                            <li className="nav-item">
                                <Link to="/View" className="nav-link active text-light" aria-current="page">Dashboard</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/BookingDetails" className="nav-link text-light mr-4">Booked details</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/Activities" className="nav-link text-light mr-4">Activities</Link>
                            </li>
                            <li className="nav-item">
                                <Link to="/RegisterParkingSpace" className="nav-link text-light mr-4">RegisterParkingSpace</Link>
                            </li>
                            {/* <li className="nav-item">
                                <Link to="#" className="nav-link text-light mr-4">SignOut</Link>
                            </li> */}
                        </ul>
                    </div>
                </div>
            </nav>

            <Routes>
                <Route exact path="/View" element={<View />} />
                <Route exact path="/BookingDetails" element={<BookingDetails />} />
                <Route exact path="/Activities" element={<Activities />} />
                <Route exact path="/RegisterParkingSpace" element={<RegisterParkingSpace />} />
            </Routes>

        </div >
    );
}

export default Adminnavbar;