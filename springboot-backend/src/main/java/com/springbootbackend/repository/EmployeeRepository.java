package com.springbootbackend.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootbackend.model.Employee;
import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Serializable> {
	
	public List<Employee> findByFirstName(String firstName);

}
