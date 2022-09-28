package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.List;

import com.parkingSystem.OnlineParkingSystem.Model.ParkingPlace;


public interface ParkingPlaceService {

	List<ParkingPlace> getPrakingPlaces();
	
	ParkingPlace searchParkingPlace(int id);
	
	boolean insertParkingPlace( ParkingPlace parkPlace);
	
}
