package com.dip.solution.model;

public class DBLogger implements ErrorLogger{
	public void error(String errorMessage) {
		System.out.println("Logged into DB : "+errorMessage);
	}
}
