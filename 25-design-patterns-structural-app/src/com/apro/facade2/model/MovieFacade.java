package com.apro.facade2.model;

public class MovieFacade {
	IMovie system;
	public void watchMovie() {
		system= new DvdPlayer();
		system.on();
		system = new SoundSystem();
		system.on();
		system = new Projector();
		system.on();
	}
	
}
