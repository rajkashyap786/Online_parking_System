package com.parkingSystem.OnlineParkingSystem.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.OnlineParkingSystem.Model.User;
import com.parkingSystem.OnlineParkingSystem.Service.UserService;


@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//Create User REST API
	
//create user
@PostMapping()
public ResponseEntity<User> saveDetails(@RequestBody User user) {
	return new ResponseEntity<User>(userService.saveDetails(user),HttpStatus.CREATED);
}
	

//	get all users
	@GetMapping("/")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
//	get user by id
	@GetMapping("/{id}")
	public ResponseEntity<User> getUserbyId(@PathVariable(value="id") int user_id) {
		return new ResponseEntity<User>(userService.getUserbyId(user_id),HttpStatus.OK);
	}
	

	
//	update user
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@RequestBody User user,@PathVariable("id") int user_id) {
		return new ResponseEntity<User>(userService.updateUser(user, user_id),HttpStatus.OK);
	}

	//delete user by Id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int user_id){
		userService.deleteUser(user_id);
		return new ResponseEntity<String>("User deleted successfully!",HttpStatus.OK) ;
	}
}
