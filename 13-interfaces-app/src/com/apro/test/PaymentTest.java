package com.apro.test;

import com.apro.Model.BankTransferPayment;
import com.apro.Model.CreditCardPayment;
import com.apro.Model.PayPalPayment;
import com.apro.Model.Payment;


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
