package com.dawn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dawn.dao.CustomerDao;

@Component
public class CustomerController {

	@Autowired
	CustomerDao customerDao;
	
	public String getCustomerStr(long id) {
		String result = customerDao.getCustomer(id).toString() + " STR";
		return result;
	}
}
