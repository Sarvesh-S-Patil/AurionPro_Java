package com.apro.Model;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;
	private double minimum_balance;
	private double overdraft_limit;
	
	

	public InsufficientBalanceException(double balance, double overdraft_limit) {
		super();
		this.balance = balance;
		this.overdraft_limit = overdraft_limit;
	}

	public String getMessage() {
		return "Insufficient Funds";
	}
	public String insufficientCurrentBalance() {
		return "Insufficient Funds , Maximum avaialble overdraft amount remained is : "+(overdraft_limit-Math.abs(balance));
	}
	public String insufficientSavingsBalance() {
		return "Your Savings balance is insufficient to complete this transaction, your balance is : "+balance;
	}
}
