package com.apro.Model;

public class Circle implements Shape {
	private int radius;

	public void area() {
		System.out.println("Area of Circle is : "+radius*radius);
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	
}
