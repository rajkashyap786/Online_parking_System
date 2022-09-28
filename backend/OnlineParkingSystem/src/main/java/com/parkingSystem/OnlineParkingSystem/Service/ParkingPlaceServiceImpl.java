package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingSystem.OnlineParkingSystem.Model.ParkingPlace;
import com.parkingSystem.OnlineParkingSystem.repositories.ParkingPlaceRepository;



@Service
public class ParkingPlaceServiceImpl implements ParkingPlaceService{

	@Autowired
	private ParkingPlaceRepository parkingRepo;
	
	
	@Override
	public List<ParkingPlace> getPrakingPlaces() {
		
		List<ParkingPlace> p1 = new ArrayList<>();
		try {
			parkingRepo.findAll().forEach(p1::add);
			return p1;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public ParkingPlace searchParkingPlace(int id) {
		try {
			Optional<ParkingPlace> opt = parkingRepo.findById(id);
			
			if(opt.isPresent()) {
				ParkingPlace p = opt.get();
				return p; 
			}else {
				return null;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean insertParkingPlace(ParkingPlace parkPlace) {
		
		try {
			parkingRepo.save(parkPlace);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
