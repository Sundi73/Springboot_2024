package com.jwt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.model.User;

@Service
public class UserServices {
	
	List<User> list = new ArrayList<>();
	
	public UserServices() {
		list.add(new User("Ashutosh Tiwari","12345","ashu@gmail.com"));
		list.add(new User("Mohan","abc","mohan@gmail.com"));
	}

	// get all users
	public List<User> getAllUsers(){
		return this.list;
	}
 	
	//get user by username
	public User getUserByName(String username) {
		return this.list.stream()
				.filter(user -> user.getName().equals(username))
				.findAny()
				.orElse(null);
	}
	
	//add new user
	public String addUser(User user) {
		list.add(user);
		return "Success";
	}
	
	
}
