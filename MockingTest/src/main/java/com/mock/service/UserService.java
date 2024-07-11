package com.mock.service;

import com.mock.dao.UserDao;

public class UserService {

	private UserDao dao;

	public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserService(UserDao dao) {
		super();
		this.dao = dao;
	}
	
	public String getNameByUserID(Integer id) {
		
		String name = dao.findNameById(id);
		return name;
	}
	
	public String getEmailByUserId(Integer id) {
	String email = dao.findEmailById(id);
	
	return email;
	}
	
	
	
}
