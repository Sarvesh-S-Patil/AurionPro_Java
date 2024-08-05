package com.apro.facade2.model;

public class DvdPlayer implements IMovie{
	
	String movie;

	@Override
	public void on() {
		System.out.println("DVD Player is on");
		
	}
	
	public void setMovie(String movie) {
		this.movie=movie;
	}

}
