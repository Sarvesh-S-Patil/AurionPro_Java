package com.apro.composite.model;

public class Leaf implements Component{
	String name;
	double price;
	
	public Leaf(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public void showPrice() {
		System.out.println(name +" : "+price);
		
	}

}
