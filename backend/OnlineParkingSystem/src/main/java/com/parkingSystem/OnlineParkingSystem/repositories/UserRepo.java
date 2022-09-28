package com.parkingSystem.OnlineParkingSystem.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.parkingSystem.OnlineParkingSystem.Model.User;



public interface UserRepo extends JpaRepository<User,Integer> {

	Optional<User> findByUsername(String username);
}
