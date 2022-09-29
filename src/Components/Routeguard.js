import React from "react";
import { Outlet, Navigate } from "react-router-dom";

const Routeguard = (props) => {

    // let authStatus = localStorage.getItem('authStatus');
    //  let authRole = localStorage.getItem('authRole');

    let authStatus = { "token": "true" };

    return (
        authStatus.token ? <Outlet /> : <Navigate to="/Home" replace="true" />
    )
};

export default Routeguard;