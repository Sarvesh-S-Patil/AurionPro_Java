package com.apro.Model;

public class BoxWeight extends Box{
	private int weight;
	public BoxWeight(int height,int width,int depth,int weight) {
		super(height,width,depth);
		this.weight=weight;
	}
	@Override
	public String toString() {
		return "BoxWeight [weight=" + weight + ", Height= " + getHeight() + ", Width= " + getWidth()
				+ ", Depth=" + getDepth() + "]";
	}
	
	

}
