package com.parkingSystem.OnlineParkingSystem.Model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class BookingSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;

	private String vehicleName;

	private String vehicleNumber;

	private String vehicleType;

	private Time parkingTime;
	
	public String OwnersName;
	
	public int bookingCost;

	@OneToOne
	@JoinColumn(name = "fk_payment_Id")
	private Payment payment;
	
	public BookingSlot(int bookingid, String vehicleName, String vehicleNumber, String vehicleType, Time parkingTime,
			String ownersName, int bookingCost) {
		super();
		this.bookingid = bookingid;
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.parkingTime = parkingTime;
		OwnersName = ownersName;
		this.bookingCost = bookingCost;
	}

	public BookingSlot() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Time getParkingTime() {
		return parkingTime;
	}

	public void setParkingTime(Time parkingTime) {
		this.parkingTime = parkingTime;
	}

	public String getOwnersName() {
		return OwnersName;
	}

	public void setOwnersName(String ownersName) {
		OwnersName = ownersName;
	}

	public int getBookingCost() {
		return bookingCost;
	}

	public void setBookingCost(int bookingCost) {
		this.bookingCost = bookingCost;
	}
	
	
	
}
