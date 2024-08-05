package com.apro.facade.test;

import com.apro.facade.model.HotelReception;

public class HotelTest {	
	public static void main(String[] args) {
		HotelReception hotelReception = new HotelReception();
		hotelReception.getIndianMenu();
		System.out.println("---------------------------");
		hotelReception.getItalianMenu();
	}
}
