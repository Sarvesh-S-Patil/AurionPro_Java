package com.apro.model;

public class Task implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Thread thread = Thread.currentThread();
		System.out.println("Current Thread : "+ thread.getName());
		
	}

}
