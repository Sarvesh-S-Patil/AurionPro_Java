package com.apro.facade.model;

public class HotelReception {
	IHotel hotel;
	IMenu menu;
	
	public void getIndianMenu() {
		hotel= new IndianHotel();
		menu = hotel.getMenu();
		menu.displayMenu();
	}
	public void  getItalianMenu() {
		hotel= new ItalianHotel();
		menu = hotel.getMenu();
		menu.displayMenu();
		
	}

}
