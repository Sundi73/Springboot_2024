package com.crud.app.service;

import java.util.List;

import com.crud.app.entity.User;

public interface UserService {
	
	public String upsert(User user);
	
	public User getUserById(int id);
	
	public List<User> getAllUser();
	
	public String deleteUserById(int id);
	
	

}
