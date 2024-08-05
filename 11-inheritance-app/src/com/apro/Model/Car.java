package com.apro.Model;

public class Car extends FourWheeler {
	double price;

	public Car(String companyName, double mileage, double price) {
		super(companyName, mileage);
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [ companyName= "+ getCompanyName()+", price=" + getPrice() + ", mileage=" + getMileage() + "]";
	}
	
}
