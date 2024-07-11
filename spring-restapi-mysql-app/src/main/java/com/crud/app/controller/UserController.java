package com.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.app.entity.User;
import com.crud.app.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public ResponseEntity<String> upsert(@RequestBody User user) {
	String status = userService.upsert(user);
	
		return new ResponseEntity<String>(status,HttpStatus.CREATED);
	}
	
	@PutMapping("/user")
	public ResponseEntity<String> updateUser(@RequestBody User user) {
	String status = userService.upsert(user);
	
		return new ResponseEntity<String>(status,HttpStatus.CREATED);
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable ("id") int id){
		User userById = userService.getUserById(id);
		return new ResponseEntity<User>(userById,HttpStatus.OK);
	}
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUser(){
		List<User> allUser = userService.getAllUser();
		return new ResponseEntity<List<User>>(allUser,HttpStatus.OK);
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id){
		String status = userService.deleteUserById(id);
		return new ResponseEntity<String>(status,HttpStatus.OK);
	}
	
}
