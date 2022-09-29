import React from "react";
import Payment from "./Payment";

function SlotBooking() {

    const navigate = useNavigate();

    const handleSubmit = event => {
        event.preventDefault();
        navigate("/Payment");
    };
    return (
        <div className="container card" style={{ marginTop: "30px", paddingTop: "20px" }}>
            <h2 className="in-title">Parking Space Booking</h2>
            <Form onSubmit={handleSubmit}>
                <div style={{ marginTop: "10px" }}>
                    <div className="form-group pt-2">
                        <input className="form-control " type="text" placeholder="Owner Name" />
                    </div>
                    <div className="form-group pt-2">
                        <input className="form-control" type="text" placeholder="Vehicle Name" />
                    </div>
                    <div className="form-group pt-2">
                        <input className="form-control" type="text" placeholder="Vehicle Type" />
                    </div>
                    <div className="form-group pt-2">
                        <input className="form-control" type="Number" placeholder="Vehicle Number" />
                    </div>
                    <div className="form-group pt-2">
                        <input className="form-control" type="date" placeholder="Parking Date" />
                    </div>
                    <div className="form-group pt-2">
                        <input className="form-control" type="time" placeholder="Parking Time" />
                    </div>
                    <div className="form-group pt-2">
                        <input className="form-control" type="time" placeholder="Exit Time" />
                    </div>

                    <div className="form-group pt-2 row">
                        <button className="btn btn-primary col-2 mr-3" type="submit" >submit</button>
                    </div>
                </div>
            </Form>
        </div>
    )
}
export default SlotBooking;