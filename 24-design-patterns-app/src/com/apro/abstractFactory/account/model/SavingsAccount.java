package com.apro.abstractFactory.account.model;

public class SavingsAccount implements IAccount{
	private long accountNumber;
	private String accountName;
	private double balance;
	private double minimumBalance;
	
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
		if(balance-amount<minimumBalance) {
			System.out.println("Insufficient Balance, available balance is : "+balance+"minimum balance required is " + minimumBalance);
			return;
		}
		balance -=amount;
		System.out.println("Debit Successful , available balance is : "+ balance);
		
	}

	public SavingsAccount(long accountNumber, String accountName, double balance, double minimumBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
		this.minimumBalance = minimumBalance;
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

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	

}
