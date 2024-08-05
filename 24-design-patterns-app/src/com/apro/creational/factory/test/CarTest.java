
package com.apro.creational.factory.test;

import com.apro.creational.factory.model.CarFactory;
import com.apro.creational.factory.model.CarName;
import com.apro.creational.factory.model.ICar;

public class CarTest {
	public static void main(String[] args) {
		ICar marutiCar = CarFactory.makeCar(CarName.Maruti);
		ICar tataCar = CarFactory.makeCar(CarName.Tata);
		ICar mahindraCar = CarFactory.makeCar(CarName.Mahindra);
		marutiCar.start();
		tataCar.start();
		mahindraCar.start();
		
	}

}
