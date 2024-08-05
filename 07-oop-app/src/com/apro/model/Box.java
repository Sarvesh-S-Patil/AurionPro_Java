package com.apro.model;

public class Box {
	public int width;
	public int height; 
	public int depth;
	
	public Box() {
		this.width = 10;
		this.height = 10;
		this.depth = 10;
		
	}
	public Box(int height,int width, int depth) {
		super();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getDepth() {
		return this.depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
}
