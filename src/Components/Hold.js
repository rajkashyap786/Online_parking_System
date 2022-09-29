import React from "react";
import { Route, Routes } from "react-router-dom";

//Components import
import Home from "./Home";
import Register from "./Register";
import Usernavbar from "./User/Usernavbar";
import Adminnavbar from "./Admin/Adminnavbar";
import Routeguard from "./Routeguard";


function Hold() {
    return (
        <div>
            <Routes>
                <Route exact path="/" element={<Home />} />
                <Route exact path="/Home" element={<Home />} />
                <Route exact path="/Register" element={<Register />} />

                {/* After Login */}
                <Route element={<Routeguard />}>
                    <Route exact path="/Usernavbar" element={<Usernavbar />} />
                    <Route exact path="/Adminnavbar" element={<Adminnavbar />} />
                </Route>
            </Routes>
        </div >
    );
}

export default Hold;
