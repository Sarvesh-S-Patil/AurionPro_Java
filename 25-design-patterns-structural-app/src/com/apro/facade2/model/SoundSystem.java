package com.apro.facade2.model;

public class SoundSystem implements IMovie{
	int volume;
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("SoundSystem is on");
		
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	};
	

}
