package com.apro.isp.solution.model;

public class ILabour implements IWorkable,ILunchInterval {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating");
		
	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub
		System.out.println("Labour is resting");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Labour started working");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Labour stopped working");
		
	}

}
