package com.apro.model;

public class Rectangle {
	private int height;
	private int width;
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public void initialize(int h,int w) {
		height=h;
		width=w;
	}
	
	public void display() {
		System.out.println("Height of rectangle : "+height);
		System.out.println("Width of rectangle : "+width);
	}
	
	public int calculateArea() {
		return height*width;
	}

	
	// Getters and Setters 
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int h) {
		height = h;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		width = w;
	}
	
	
	
	
	

}
