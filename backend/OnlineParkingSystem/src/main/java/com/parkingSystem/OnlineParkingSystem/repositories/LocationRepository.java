package com.parkingSystem.OnlineParkingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkingSystem.OnlineParkingSystem.Model.Location;

public interface LocationRepository extends JpaRepository<Location,Integer>{

}
