package com.apro.decorator.model;

public class OilChange extends CarServiceDecorator{

	public OilChange(IService carObj) {
		super(carObj);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		
		return carObj.getCost()+500;
	}
	

}
