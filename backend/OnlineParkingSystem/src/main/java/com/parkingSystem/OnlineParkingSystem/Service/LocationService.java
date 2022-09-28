package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.List;

import com.parkingSystem.OnlineParkingSystem.Model.Location;


public interface LocationService {

	List<Location> getLocation();
	
	Location searchLocation(int id);
	
	boolean insertLocation(Location location);
	boolean updateLocation(Location location);
	boolean deleteLocationt(int id);
}
