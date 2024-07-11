package com.crud.app.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.crud.app.entity.User;
import com.crud.app.exception.NoUserFoundException;
import com.crud.app.repo.UserRepositry;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepositry userRepositry;    
	
	@Override
	public String upsert(User user) {
	    //User u1 = new User();
	    
		userRepositry.save(user);
		
		return "Success";
	}

	@Override
	public User getUserById(int id) {
			Optional<User> userById = userRepositry.findById(id);
			if(userById.isPresent()) {
				return userById.get();
			} else {
				// thrown custom Exception..!!
				throw new NoUserFoundException("No User Found ");
			}
		
	}

	@Override
	public List<User> getAllUser() {
		
		return userRepositry.findAll();
	}

	@Override
	public String deleteUserById(int id) {
		if(userRepositry.existsById(id)) {
			userRepositry.deleteById(id);
			return "success";
		}else {
			return "Id Not Found";
		}
	}
	

	
	
}
