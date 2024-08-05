package com.apro.decorator.model;

public class WheelAlign extends CarServiceDecorator {

	public WheelAlign(IService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return carObj.getCost()+500;
	}
	
}
