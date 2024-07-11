package com.jwt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.model.User;
@Service
public class UserService {

	List<User> list = new ArrayList<>();

	public UserService() {
		list.add(new User("121","Ashutosh","Ashu@gmail.com"));
		list.add(new User("111","Mohan","mohan@gmail.com"));
		list.add(new User("133","Gyan","ggyan@gmail.com"));

	}

	//to get all users from the list.
	public List<User> getAllUsers(){
		return this.list;
	}

	public User getSingleUser(String userID) {
		return list.stream().filter(user -> user.getUserId().equals(userID)).findAny().orElse(null);
	}

	public String addUser(User user) {
		list.add(user);
		return "Success";
	}

}
