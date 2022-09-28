package com.parkingSystem.OnlineParkingSystem.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.OnlineParkingSystem.Model.ParkingPlace;
import com.parkingSystem.OnlineParkingSystem.Service.ParkingPlaceService;



@RestController
public class ParkingPlaceController {

	@Autowired
	private ParkingPlaceService parkDao;
	
	@GetMapping(value = "/getParkingPlace")
	public List<ParkingPlace> getAddress() {
		List<ParkingPlace> p1 = parkDao.getPrakingPlaces();
		return p1;
	}
	
	@GetMapping(value = "/searchParkingPlace/{id}")
	public ParkingPlace searchEmployee (@PathVariable int id) {
		ParkingPlace a1 =parkDao.searchParkingPlace(id);
		return a1;
	}
	
	@PostMapping(value = "/insertParkingPlace")
	public boolean insertEmployee (@RequestBody ParkingPlace parkPlace) {
		try {
			parkDao.insertParkingPlace(parkPlace);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
