package com.crud.app.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.app.entity.User;


public interface UserRepositry extends JpaRepository<User, Serializable> {
}
