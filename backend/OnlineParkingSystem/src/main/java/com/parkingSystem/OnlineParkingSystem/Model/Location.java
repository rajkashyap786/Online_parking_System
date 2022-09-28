package com.parkingSystem.OnlineParkingSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int locationId;
	private String locationName;
	
	
	public Location(int locationId, String locationName) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
	}
	
	@ManyToOne
	@JoinColumn(name = "fk_parkArea_Id")
	private ParkingPlace parkArea;
	
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getLocationId() {
		return locationId;
	}
	
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	public String getLocationName() {
		return locationName;
	}
	
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
	
}
