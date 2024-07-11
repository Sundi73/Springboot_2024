package com.springbootbackend.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.springbootbackend.model.Employee;
import com.springbootbackend.repository.EmployeeRepository;

@SpringBootTest
class EmployeeServicesTest {

	@MockBean
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeServices employeeService;
	
	@BeforeEach
	void setUp() {
		
		Employee employee = Employee.builder()
				.id(1)
				.firstName("Ashutosh")
				.lastName("Tiwari")
				.emailId("ashutosh@google.com")
				.build();
		
		Mockito.when(employeeRepository.findById(1));
	}

	@Test
	public void whenValidEmployeeId_thenEmployeeDetailsFound() {
		int id = 1;
		Employee found = employeeService.getEmployeeById(id);
		
		assertEquals(id, found.getId());
		
	}

}
