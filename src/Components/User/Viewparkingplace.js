import React from "react";


function Viewparkingplace() {
    return (
        <div className="container " style={{ marginTop: "50px" }}>
            <div className="row">
                <div className="col-6">
                    <div className="card">
                        <div className="card-body">
                            <span>Information Parking Place</span>
                        </div>
                        <ul className="list-group list-group-flush">
                            <li className="list-group-item">Parking Place Name :</li>
                            <li className="list-group-item">Total Parking slot : </li>
                            <li className="list-group-item">Total Booked slot : </li>
                            <li className="list-group-item">Total Remaining Slot : </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    )
}
export default Viewparkingplace;