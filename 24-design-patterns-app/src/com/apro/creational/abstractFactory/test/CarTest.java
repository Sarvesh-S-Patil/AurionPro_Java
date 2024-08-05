package com.apro.creational.abstractFactory.test;

import com.apro.creational.abstractFactory.model.ICar;
import com.apro.creational.abstractFactory.model.ICarFactory;
import com.apro.creational.abstractFactory.model.MarutiFactory;
import com.apro.creational.abstractFactory.model.TataFactory;

public class CarTest {
	public static void main(String[] args) {
		ICarFactory marutiFactory = new  MarutiFactory();
		ICar marutiCar = marutiFactory.make();
		marutiCar.start();
		marutiCar.stop();
		
		ICarFactory tataFactory = new TataFactory();
		ICar tataCar = tataFactory.make();
		tataCar.start();
		tataCar.stop();
		
	}

}
