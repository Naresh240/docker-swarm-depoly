package org.javacodegeeks.model;

public class Customer {
	private String custId;
	private String name;
	private String zipcode;
	

	public Customer() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZipCode() {
		return zipcode;
	}

	public void setZipCode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

}