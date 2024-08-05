package com.apro.Model;

public class Rectangle  implements Shape{
	int length;
	int breadth;
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void area() {
		System.out.println("Area of Rectangle is : "+ length*breadth);
		
	}
	
}
