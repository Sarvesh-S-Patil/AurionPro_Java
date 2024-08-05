package com.apro.violation;

public class Guitar { 
	private String serialNumber;
	private double price; 
	private Builder builder;
	private String model; 
	private Type type;
	private Wood backWood; 
	private Wood topWood;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		super();
		this.serialNumber = serialNumber;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public GuitarSpec getGuitarSpec() {
		return new GuitarSpec(builder, model, type, backWood, topWood);
	}
	
	
 
}
