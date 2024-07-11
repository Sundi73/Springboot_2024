package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices userservices;
	
	
	@GetMapping("/")
	public List<User> listOfAllUsers(){
		return userservices.getAllUsers();
	}
	
	@GetMapping("/{username}")
	public User listOfUserByUsername(@PathVariable("username") String username) {
		return this.userservices.getUserByName(username);
	}
	
	
	@PostMapping("/")
	public String addUserToList(@RequestBody User user) {
		String userAdded = this.userservices.addUser(user);
		
		return userAdded;
	}
	
}
