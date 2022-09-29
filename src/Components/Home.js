import React from "react";
import Footer from "./Footer";
import Feature from "./Feature";
import { Link } from "react-router-dom";

function Home() {
    return (
        <div>
            <div className="container pb-md-5 pb-4 pt-5">
                <div className="row pb-xl-5 align-items-center">
                    <div className="col-lg-6 position-relative home-block-3-left pb-lg-0 pb-5">
                        <div className="position-relative">
                            <img src="image/goodparking.jpg" alt="" className="img-fluid radius-image" />
                        </div>
                    </div>
                    <div className="col-xl-5 col-lg-6 offset-xl-1 mt-lg-0 mt-5 pt-lg-0 pt-5">
                        <h3>Login</h3>
                        <div style={{ marginTop: "10px" }} className="mt-4 list-style-lis pt-lg-1">
                            <div className="form-group pt-1">
                                <input className="form-control" type="email" placeholder="Email" />
                            </div>
                            <div className="form-group pt-1">
                                <input className="form-control" type="password" placeholder="Password" />
                            </div>
                            <div className="form-group  row pt-2">
                                <button className="btn btn-primary col-2" >submit</button>
                                <Link to="/Register" className="nav-link"> Do Not Have a Account? <strong>Register Now</strong></Link>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <Feature />
            <Footer />
        </div>
    )
}
export default Home;