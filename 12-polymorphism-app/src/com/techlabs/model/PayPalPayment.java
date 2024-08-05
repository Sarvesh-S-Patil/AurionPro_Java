package com.techlabs.model;

public class PayPalPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Inside PayPal process payment");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Inside PayPal Refund");
		
	}

}
