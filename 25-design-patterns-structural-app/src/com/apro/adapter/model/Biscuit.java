package com.apro.adapter.model;

public class Biscuit implements IItem{
	private String name;
	private double price;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public Biscuit(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	
}
