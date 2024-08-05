package com.apro.Model;

public class Triangle implements Shape {
	int base;
	int height;
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public void area() {
		System.out.println("Area of Traingle is : "+0.5*base*height);
	}
	
	

}
