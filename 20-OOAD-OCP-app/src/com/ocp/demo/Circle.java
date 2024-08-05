package com.ocp.demo;

public class Circle implements Shape {
	int radius;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	
}
