package com.java.example;

public class Employee {
	
	private String name;
	private String address;
	private String department;
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String address, String department) {
		super();
		this.name = name;
		this.address = address;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return name+" "+address+" "+department;
	}

	
	
	
	

}
