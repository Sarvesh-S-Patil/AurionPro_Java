package com.apro.creational.abstractFactory.model;

public class TataCar  implements ICar{

	@Override
	public void start() {
		System.out.println("Tata Car Started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Tata Car Stopped");
		
	}

}
