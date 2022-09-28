package com.parkingSystem.OnlineParkingSystem.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.OnlineParkingSystem.Model.Payment;
import com.parkingSystem.OnlineParkingSystem.Service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentDao;

	@GetMapping(value = "/getPaymentInfo")
	public List<Payment> getPaymentInfo() {
		List<Payment> p1 = paymentDao.getPaymentInfo();
		return p1;

	}

	@GetMapping(value = "/getPaymentById/{id}")
	public Payment getPaymentById(@PathVariable int id) {
		Payment p1 = paymentDao.getPaymentById(id);
		return p1;

	}

	@PostMapping(value = "/addPaymentDetails")
	public boolean addPaymentDetails(@RequestBody Payment payment) {
			try {
				paymentDao.addPaymentDetails(payment);
				return true;
			}catch(Exception e) {
				e.printStackTrace();
				return false;
			}
	}

}
