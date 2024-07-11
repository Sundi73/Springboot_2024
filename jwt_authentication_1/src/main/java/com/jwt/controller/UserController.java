package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.model.User;
import com.jwt.services.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userservice;

	@GetMapping("/users")
	public List<User> getAll() {
		return this.userservice.getAllUsers();
	}
	
	@GetMapping("/user/{userId}")
	public User getSingleUser(@PathVariable("userId") String userId) {
		return this.userservice.getSingleUser(userId);
	}
	
	
}
