import React from "react";
import { Link } from "react-router-dom";

function Register() {
    return (

        <div className="container card" style={{ marginTop: "30px", paddingTop: "20px" }}>
            <h2 className="in-title">Register</h2>

            <div style={{ marginTop: "10px" }}>
                <div className="form-group pt-2">
                    <input className="form-control " type="text" placeholder="Name" />
                </div>
                <div className="form-group pt-2">
                    <input className="form-control" type="email" placeholder="Email" />
                </div>
                <div className="form-group pt-2">
                    <input className="form-control" type="text" placeholder="Username" />
                </div>
                <div className="form-group pt-2">
                    <input className="form-control" type="password" placeholder="Password" />
                </div>
                <div className="form-group pt-2">
                    <input className="form-control" type="tel" placeholder="Contact" />
                </div>
                <div className="form-group pt-2">
                    <input className="form-control" type="text" placeholder="Address" />
                </div>
                <div className="form-group pt-2 row">
                    <button className="btn btn-primary col-2 mr-3" >Register</button>
                    <Link to="/Login" className="nav-link"> Already Registered? <strong>Login Now</strong></Link>
                </div>
            </div>
        </div>
    )
}
export default Register;

