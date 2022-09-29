import React from "react";

function View() {
    return (
        <div style={{ marginTop: "20px" }}>


            <div className="row" style={{ paddingTop: "15px", paddingBottom: "15px" }}>
                <h3 className="col-md-3">Registered Users</h3>
                {/* <Link to="/dashboard/users/create" className="btn btn-primary col-md-2 offset-7">Add Users</Link> */}
            </div>

            <table className="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Contact</th>
                        <th>Address</th>
                        <th>Booking Status</th>
                    </tr>
                </thead>
                <tbody>

                    {
                        //   this.state.users.map((user,index)=>{
                        //     return(<tr key={index}>
                        //        <td>{index+1}</td>
                        //        <td>{user.name}</td>
                        //        <td>{user.email}</td>
                        //        <td>{user.contact}</td>
                        //        <td>{user.address}</td>
                        //        <td>{user.status}</td>
                        //         <td>
                        //          {user.approved===true?
                        //           (<button className="btn btn-danger" onClick={()=>{this.approval(index)}}>UnApprove</button>): 
                        //           (<button className="btn btn-success" onClick={()=>{this.approval(index)}}>Approve</button>)}
                        //        </td> 
                        //       </tr>)
                        //     })
                    }
                </tbody>
            </table>
        </div>
    )
}
export default View;