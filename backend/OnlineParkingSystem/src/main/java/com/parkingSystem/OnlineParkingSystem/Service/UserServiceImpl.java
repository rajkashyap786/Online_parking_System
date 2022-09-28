package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.List;
//import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.parkingSystem.OnlineParkingSystem.Model.User;
import com.parkingSystem.OnlineParkingSystem.repositories.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	private UserRepo userRepo;
	
	public UserServiceImpl(UserRepo userRepo) {
		super();
		this.userRepo=userRepo;
	}

	@Override
	public User saveDetails(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserbyId(int user_id) {
//		 Optional<User> user= userRepo.findById(user_id);
//		 if(user.isPresent()) {
//			 return user.get();
//		 }
//		 else {
//			 throw new ResourceNotFoundException("User","user_Id",user_id);
//		 }
		
		return userRepo.findById(user_id)
				.orElseThrow(()-> new EntityNotFoundException("User not found"));
	}

	@Override
	public User updateUser(User user, int user_id) {
		
		//we need check whether user with given id is exist in DB or not
		User existingUser=userRepo.findById(user_id)
				.orElseThrow(()-> new EntityNotFoundException("User not found"));
		existingUser.setName(user.getName());
		existingUser.setEmail(user.getEmail());
		existingUser.setContact(user.getContact());
		existingUser.setAddress(user.getAddress());
//		save existing user to DB
		userRepo.save(existingUser);
		return existingUser;
	}

	@Override
	public void deleteUser(int user_id) {
		userRepo.findById(user_id)
		.orElseThrow(()-> new EntityNotFoundException("User not found"));
		userRepo.deleteById(user_id);
	}

}
