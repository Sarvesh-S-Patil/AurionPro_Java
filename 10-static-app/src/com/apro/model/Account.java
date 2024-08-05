package com.apro.model;

public class Account {
	static int accountCount=0;
	private int accountNumber;
	private String name;
	private int balance;
	
	{
		System.out.println("Account count is "+accountCount );
		accountCount=accountCount+1;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static int getAccountCount() {
		return accountCount;
	}
	public static void setAccountCount(int accountCount) {
		Account.accountCount = accountCount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	public Account(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	

}
