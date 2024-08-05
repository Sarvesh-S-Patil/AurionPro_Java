package com.apro.Model;

public class InsufficientSavingsBalanceException  extends RuntimeException{
	double minimum_balance;
	double balance;
	public InsufficientSavingsBalanceException(double balance,double minimum_balance) {
		super();
		this.minimum_balance=minimum_balance;
		this.balance = balance;
	}
	
	public String getMessage() {
		return "Insufficient funds , Your Current Balance is "+balance+" , Minimum Balance Required is : "+minimum_balance;
	}
	
	
}
