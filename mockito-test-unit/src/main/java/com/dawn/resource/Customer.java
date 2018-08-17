package com.dawn.resource;

public class Customer {

	private long id;
	private String firstName;
	private String lastName;
	private String customerType;

	public Customer(long id, String firstName, String lastName, String customerType) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerType = customerType;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", customerType="
				+ customerType + "]";
	}
	
}
