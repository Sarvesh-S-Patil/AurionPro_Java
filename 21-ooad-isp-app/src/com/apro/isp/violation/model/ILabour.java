package com.apro.isp.violation.model;

public class ILabour  implements IWorker{

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour started working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Labour stopper working");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Labour is eating");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Labour is drinking");
		
	}

}
