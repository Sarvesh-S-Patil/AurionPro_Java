package com.apro.decorator.model;

public abstract class CarServiceDecorator implements IService {
	IService carObj;

	public CarServiceDecorator(IService carObj) {
		super();
		this.carObj = carObj;
	}
	
	
	

}
