package com.user.service.services;

import java.util.List;

import com.user.service.entities.User;

public interface UserServices{
	
	public String upsert(User user);
	
	public List<String> getAllUser();
	
	public String getUserById(int id);

	public String deleteById(int id);
}
