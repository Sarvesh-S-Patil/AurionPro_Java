package com.techlabs.test;

import com.techlabs.model.BankTransferPayment;
import com.techlabs.model.CreditCardPayment;
import com.techlabs.model.PayPalPayment;
import com.techlabs.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		 
		Payment payment = new CreditCardPayment();
		payment.processPayment();
		payment.refund();
		
		payment = new PayPalPayment();
		payment.processPayment();
		payment.refund();
		
		payment= new BankTransferPayment();
		payment.processPayment();
		payment.refund();
		
		
	}

}
