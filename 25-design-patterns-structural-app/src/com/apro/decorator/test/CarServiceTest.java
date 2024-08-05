package com.apro.decorator.test;

import com.apro.decorator.model.CarInspection;
import com.apro.decorator.model.IService;
import com.apro.decorator.model.OilChange;
import com.apro.decorator.model.WheelAlign;

public class CarServiceTest {
	public static void main(String[] args) {
		IService service = new CarInspection();
		System.out.println(service.getCost());
		service = new OilChange(service);
		System.out.println(service.getCost());
		service= new WheelAlign(service);
		System.out.println(service.getCost());
	}

}
