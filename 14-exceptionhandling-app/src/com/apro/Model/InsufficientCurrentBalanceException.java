package com.apro.Model;

public class InsufficientCurrentBalanceException  extends RuntimeException{
	double balance;
	double overdraft_limit;
	public InsufficientCurrentBalanceException(double balance, double overdraft_limit) {
		super();
		this.balance = balance;
		this.overdraft_limit = overdraft_limit;
	}
	public String getMessage() {
		return "Insufficient Funds, Current Balance "+balance+" , Maxmimum overdraft limit is "+overdraft_limit;
	}

}
