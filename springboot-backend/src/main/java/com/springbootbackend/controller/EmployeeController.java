package com.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbackend.model.Employee;
import com.springbootbackend.services.EmployeeServices;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;
	
	//this mothod is used to store employee in db...!!
	
	@PostMapping("/employee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp){
		String upsert = employeeServices.upsert(emp);
		
		return new ResponseEntity<String>(upsert,HttpStatus.CREATED);
	}
	
	@PutMapping("employee")
	public ResponseEntity<String> updateEmployeeDetails(@RequestBody Employee emp){
		String update = employeeServices.upsert(emp);
		return new ResponseEntity<String>(update,HttpStatus.CREATED);
	}
	
	
	//this method is used for getting single employee details from db..!!
	@GetMapping("/employee/{id}")
	public ResponseEntity<Employee> getSingleEmployeeDetails(@PathVariable("id") Integer id){
		Employee employeeById = employeeServices.getEmployeeById(id);
		return new ResponseEntity<Employee>(employeeById,HttpStatus.OK);
		
	}
	
	//this method is used to get All element from the bd...!
	@GetMapping("/employee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> allEmployee = employeeServices.getAllEmployee();
		return new ResponseEntity<List<Employee>>(allEmployee,HttpStatus.OK);
	}
	
	@GetMapping("/employee/name/{name}")
	public ResponseEntity<List<Employee>> getEmployeeByFirstName(@PathVariable("name") String firstName) {
		List<Employee> employeeByName = employeeServices.getEmployeeByName(firstName);
		return new ResponseEntity<List<Employee>>(employeeByName,HttpStatus.OK);
	}
	
	
}
