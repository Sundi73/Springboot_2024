package com.springbootbackend.services;

import java.util.List;


import com.springbootbackend.model.Employee;

public interface EmployeeServices {
	
	public String upsert(Employee emp);
	
	public Employee getEmployeeById(int id);
	
	public List<Employee> getAllEmployee();
	
	public String deleteEmployeeById(Integer id);
	
	public List<Employee> getEmployeeByName(String firstName);

}
