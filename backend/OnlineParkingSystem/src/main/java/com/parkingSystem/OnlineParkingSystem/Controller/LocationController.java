package com.parkingSystem.OnlineParkingSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.OnlineParkingSystem.Model.Location;
import com.parkingSystem.OnlineParkingSystem.Service.LocationService;



@RestController
public class LocationController {

	@Autowired
	private LocationService locDao;
	
	@GetMapping("/getLocation")
	public List<Location> getLoaction(){
		
		List<Location> l1 = locDao.getLocation();
		return l1;
	}
	
	@GetMapping(value = "/searchLocation/{id}")
	public Location searchLocation(@PathVariable int id) {
		Location a1 = locDao.searchLocation(id);
		return a1;
	}
	
	@PostMapping(value = "/insertLocation")
	public boolean insertAddress(@RequestBody Location loc) {
		if(locDao.insertLocation(loc)) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
