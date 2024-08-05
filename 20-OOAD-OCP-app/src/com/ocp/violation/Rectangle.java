package com.ocp.violation;

public class Rectangle {
	int height;
	int width;
	
	
	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}


	public int area() {
		return height*width;
	}

}
