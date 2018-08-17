package com.dawn.dao;

import org.springframework.stereotype.Repository;

import com.dawn.resource.Customer;

@Repository
public class CustomerDao {
	
	/**
	 * This method simulate getting customer from DB
	 * @param id number of customer
	 * @return Customer object
	 */
	public Customer getCustomer(long id) {
		return new Customer(1, "Shahar", "Zror", "C");
	}
	
}
