package com.user.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.service.entities.User;
import com.user.service.repositories.UserRepository;

@Service
public class UserServicesImpl implements UserServices{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String upsert(User user) {
		
		this.userRepository.save(user);
		return "Success";
	}

	@Override
	public List<String> getAllUser() {
		this.userRepository.findAll();
		return null;
	}

	@Override
	public String getUserById(int id) {
		userRepository.getById(id);
		return null;
	}

	@Override
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
