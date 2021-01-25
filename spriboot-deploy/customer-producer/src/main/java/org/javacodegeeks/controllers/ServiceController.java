package org.javacodegeeks.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.javacodegeeks.model.Customer;

@RestController
public class ServiceController {

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public Customer firstPage() {

		Customer customer = new Customer();
		customer.setName("cust1");
		customer.setCustId("12");
		customer.setZipCode("50100");

		return customer;
	}

}