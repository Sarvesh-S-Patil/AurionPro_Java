package com.apro.isp.violation.model;

public class IRobot implements IWorker {

	@Override
	public void startWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot started working");
		
	}

	@Override
	public void stopWork() {
		// TODO Auto-generated method stub
		System.out.println("Robot stopped working");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Robot is eating");
		
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("Robot is drinking");
		
	}

}
