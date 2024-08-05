package com.ocp.demo;

public class Rectangle implements Shape {
	int height;
	int width;
	@Override
	public double area() {
		return height*width;
		
	}
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	
	
	

}
