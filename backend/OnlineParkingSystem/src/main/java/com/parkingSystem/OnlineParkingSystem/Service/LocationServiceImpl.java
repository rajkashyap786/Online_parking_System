package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingSystem.OnlineParkingSystem.Model.Location;
import com.parkingSystem.OnlineParkingSystem.repositories.LocationRepository;



@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository locationRepo;
	
	@Override
	public List<Location> getLocation() {
		List<Location> l1 = new ArrayList<>();
		try {
			locationRepo.findAll().forEach(l1::add);
			return l1;
		}catch(Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Location searchLocation(int id) {
		
	
		try {
			Optional<Location> opt = locationRepo.findById(id);
			
			if(opt.isPresent()) {
				Location lo = opt.get();
				return lo; 
			}else {
				return null;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean insertLocation(Location location) {
		
		
		try {
			locationRepo.save(location);
			return true;
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean updateLocation(Location location) {
		
		try {
			Optional<Location> opt = locationRepo.findById(location.getLocationId());
			if(opt.isPresent()) {
				locationRepo.save(location);
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteLocationt(int id) {
		try {
			Optional<Location> opt =locationRepo.findById(id);
			
			if(opt.isPresent()) {
				locationRepo.deleteById(id);
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	

}
