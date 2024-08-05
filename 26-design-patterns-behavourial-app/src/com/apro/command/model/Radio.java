package com.apro.command.model;

public class Radio implements Device {
	Device device;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
			System.out.println("Radio is turned on");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio is turned Off");
		
	}
	

}
