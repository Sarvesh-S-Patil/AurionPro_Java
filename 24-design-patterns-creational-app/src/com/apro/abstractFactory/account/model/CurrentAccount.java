package com.apro.abstractFactory.account.model;

public class CurrentAccount implements IAccount {
	private long accountNumber;
	private String accountName;
	private double balance;
	private double overdraftLimit;
	@Override
	public void credit(int amount) {
		// TODO Auto-generated method stub
		if(amount<0) {
			System.out.println("Credit amount cannot be negative");
			return;
		}
		balance += amount;
		System.out.println("Credit succesfull, available balance is "+balance);
		
	}

	@Override
	public void debit(int amount) {
		// TODO Auto-generated method stub
		if( balance+overdraftLimit - amount <0 ) {
			System.out.println("Debit Failed");
			System.out.println("Insufficient funds , avaialable balance is "+balance+" overdraft limit is "+overdraftLimit);
			return ;
		}
		System.out.println("Debit Successfull");
		System.out.println("Available balance is "+balance);
		
	}

	public CurrentAccount(long accountNumber, String accountName, double balance, double overdraftLimit) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	

}