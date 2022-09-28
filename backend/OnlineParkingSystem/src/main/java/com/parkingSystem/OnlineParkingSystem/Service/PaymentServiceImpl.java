package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parkingSystem.OnlineParkingSystem.Model.Payment;
import com.parkingSystem.OnlineParkingSystem.repositories.PaymentRepository;



@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	private PaymentRepository paymentRepo;
	
	@Override
	public List<Payment> getPaymentInfo() {
		List<Payment> p1 = new ArrayList<>();
		
		try {
			paymentRepo.findAll().forEach(p1::add);
			return p1;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Payment getPaymentById(int id) {
		
		try {
			Optional<Payment> opt = paymentRepo.findById(id);
			
			if(opt.isPresent()) {
				Payment v = opt.get();
				return v; 
			}else {
				return null;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public boolean addPaymentDetails(Payment payment) {
		
		try {
			paymentRepo.save(payment);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
