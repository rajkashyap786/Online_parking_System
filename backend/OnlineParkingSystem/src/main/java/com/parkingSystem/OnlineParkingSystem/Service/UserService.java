package com.parkingSystem.OnlineParkingSystem.Service;

import java.util.List;

import com.parkingSystem.OnlineParkingSystem.Model.User;



public interface UserService {

	User saveDetails(User user);
	List<User> getAllUsers();
	User getUserbyId(int user_id);
	User updateUser(User user,int user_id);
	void deleteUser(int user_id);
}
