package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

public interface UserRepositry extends CrudRepository<User,Integer> {

}
