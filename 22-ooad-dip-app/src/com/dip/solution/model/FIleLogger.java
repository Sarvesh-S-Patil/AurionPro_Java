package com.dip.solution.model;

public class FIleLogger implements ErrorLogger{
	

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("Logged into file : "+message);
	}
}