package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.List;

import com.parkingSystem.OnlineParkingSystem.Model.Payment;

//import com.cdac.FinalProject.pojo.Location;


public interface PaymentService {

	List<Payment> getPaymentInfo();
	
	Payment getPaymentById(int id);
	
	boolean addPaymentDetails(Payment payment);
}
