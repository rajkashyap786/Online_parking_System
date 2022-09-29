import React from "react";

function Contact() {
    return (
        <div>
            <div className="container pb-md-5 pb-4">
                <h3 className="title-style pt-4 text-center">Contact Us</h3>
                <p className="mt-4 px-5">If you need any help or additional info about our parking system and services,
                    just complete the form and our friendly support team will contact you shortly!</p>

                <div className="row pb-xl-5 align-items-center">
                    <div className="col-lg-6 position-relative home-block-3-left pb-lg-0 pb-5">
                        <div className="position-relative">
                            <img src="image/parking.jpg" alt="" className="img-fluid radius-image" />
                        </div>
                    </div>
                    <div className="col-xl-5 col-lg-6 offset-xl-1 mt-lg-0 mt-5 pt-lg-0 pt-5">
                        <h3>Contact Form</h3>
                        <div style={{ marginTop: "10px" }} className="mt-4 list-style-lis pt-lg-1">
                            <div className="form-group pt-1">
                                <input className="form-control" type="text" placeholder="Name" />
                            </div>
                            <div className="form-group pt-1">
                                <input className="form-control" type="email" placeholder="Email" />
                            </div>
                            <div className="form-group pt-1">
                                <input className="form-control" type="text" placeholder="Address" />
                            </div>
                            <div className="form-group pt-1">
                                <input className="form-control" type="textarea" placeholder="Type Here" style={{ height: "150px" }} />
                            </div>
                            <div className="form-group col-2 row pt-1">
                                <button className="btn btn-primary my-1" >Submit</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div className=" bg-primary text-light">
                <div className="row content23-col-2 text-center">
                    <div className="col-md-4 pt-4">
                        <div className="content23-grid content23-grid1">
                            <h4><a>Head Office</a></h4>
                            <p>62/7B Yashoda Nagar Kanpur.</p>
                        </div>
                    </div>
                    <div className="col-md-4 mt-md-0 mt-4 pt-4">
                        <div className="content23-grid content23-grid2">
                            <h4><a>Administrative Office</a></h4>
                            <p>55A Kalyanpur Kanpur</p>
                        </div>
                    </div>
                    <div className="col-md-4 mt-md-0 mt-4 pt-4">
                        <div className="content23-grid content23-grid2">
                            <h4><a>Branch Office</a></h4>
                            <p>42/A NeelMatha Kanpur.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default Contact;