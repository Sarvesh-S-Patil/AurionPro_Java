package com.apro.model;

public class AreaCalculator {
	
	public int areaOfCircle(int radius) {
		return (int)(3.14*radius*radius);
	}
	
	public int areaOfRectangle(int length,int breadth) {
		return length*breadth;
	}
	
	public int areaOfTriangle(int base,int height) {
		return (int)(0.5*base*height);
	}
	
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}

}
