package com.springbootbackend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootbackend.exception.ResourceNotFoundException;
import com.springbootbackend.model.Employee;
import com.springbootbackend.repository.EmployeeRepository;
@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public String upsert(Employee emp) {
		employeeRepository.save(emp);
		return "Success";
	}

	@Override
	public Employee getEmployeeById(int id) {
			Optional<Employee> findById = employeeRepository.findById(id);
			
			if(findById.isPresent()) {
				return findById.get();
			}else {
				throw new ResourceNotFoundException("No user found");
			}
	}

	@Override
	public List<Employee> getAllEmployee() {
		return this.employeeRepository.findAll();
	}

	@Override
	public String deleteEmployeeById(Integer id) {
		if(employeeRepository.existsById(id)) {
			employeeRepository.deleteById(id);
		}else {
		 throw new ResourceNotFoundException("No User Found");
		}
		return null;
	}
	
	public List<Employee> getEmployeeByName(String firstName) throws ResourceNotFoundException {
			return employeeRepository.findByFirstName(firstName);
				
	}

}
