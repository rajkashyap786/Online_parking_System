package com.parkingSystem.OnlineParkingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkingSystem.OnlineParkingSystem.Model.Payment;


public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
