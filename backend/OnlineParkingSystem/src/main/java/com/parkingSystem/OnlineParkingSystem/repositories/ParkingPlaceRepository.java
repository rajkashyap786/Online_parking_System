package com.parkingSystem.OnlineParkingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkingSystem.OnlineParkingSystem.Model.ParkingPlace;


public interface ParkingPlaceRepository extends JpaRepository<ParkingPlace,Integer>{

}
