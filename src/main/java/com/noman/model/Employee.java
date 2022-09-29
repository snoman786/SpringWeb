package com.noman.model;

/*
 * Employee is a standard java bean and we will use our 
 * custom Validator implementation to validate the form 
 * with Employee bean.EmployeeFormValidator
 */
public class Employee {

	private int id;
	private String name;
	private String role;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
