package com.apro.Model;

public class FourWheeler extends Vehicle{
	private double mileage;

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public FourWheeler(String companyName,double mileage) {
		super(companyName);
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "FourWheeler [companyName= " + getCompanyName() + "mileage= " + mileage + "]";
	}

	
	
	
}
