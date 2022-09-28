package com.parkingSystem.OnlineParkingSystem.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class ParkingPlace {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String parkingAddress;
	private int totalCharge;
	private int totalSlots;
	private int bookedSlots;
	private int avalibleSlots;
	
	
	
	public ParkingPlace(int id, String parkingAddress, int totalCharge, int totalSlots, int bookedSlots,
			int avalibleSlots) {
		super();
		this.id = id;
		this.parkingAddress = parkingAddress;
		this.totalCharge = totalCharge;
		this.totalSlots = totalSlots;
		this.bookedSlots = bookedSlots;
		this.avalibleSlots = avalibleSlots;
	}

	public ParkingPlace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getParkingAddress() {
		return parkingAddress;
	}

	public void setParkingAddress(String parkingAddress) {
		this.parkingAddress = parkingAddress;
	}

	public int getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(int totalCharge) {
		this.totalCharge = totalCharge;
	}

	public int getTotalSlots() {
		return totalSlots;
	}

	public void setTotalSlots(int totalSlots) {
		this.totalSlots = totalSlots;
	}

	public int getBookedSlots() {
		return bookedSlots;
	}

	public void setBookedSlots(int bookedSlots) {
		this.bookedSlots = bookedSlots;
	}

	public int getAvalibleSlots() {
		return avalibleSlots;
	}

	public void setAvalibleSlots(int avalibleSlots) {
		this.avalibleSlots = avalibleSlots;
	}
	
	
	
	
	
	
	
	
}
