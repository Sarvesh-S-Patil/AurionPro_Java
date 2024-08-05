package com.apro.Model;

public class CreditCardPayment implements Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Inside Credit Card process payment");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Inside Credit Card Refund");
		
	}

}
