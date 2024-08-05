package com.apro.Model;

public class Vehicle {
	private String companyName;

	public Vehicle(String companyName) {
		super();
		this.companyName = companyName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Vehicle [companyName=" + companyName + "]";
	}
	
}
