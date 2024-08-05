package com.apro.creational.factory.model;

public class CarFactory {
	
	
	public static ICar makeCar(CarName carName) {
		ICar car=null;
		if(carName==CarName.Maruti)
			return car=new MarutiCar();
		if(carName==CarName.Tata)
			return car =new TataCar();
		if(carName==CarName.Mahindra)
			return car=new MahindraCar();
		return car;
	}

}
