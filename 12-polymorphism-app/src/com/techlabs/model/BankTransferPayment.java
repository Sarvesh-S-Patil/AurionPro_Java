package com.techlabs.model;

public class BankTransferPayment extends Payment {

	@Override
	public void processPayment() {
		// TODO Auto-generated method stub
		System.out.println("Inside BankTransfer process payment");
		
	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub
		System.out.println("Inside BankTrasfer Refund");
		
	}

}
