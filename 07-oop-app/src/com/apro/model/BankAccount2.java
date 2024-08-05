package com.apro.model;


public class BankAccount2 {
	private int accountNumber;
	private String name;
	private int balance;
	
	public BankAccount2() {
		super();
		// TODO Auto-generated constructor stub
	}


	public BankAccount2(int accountNumber,String name,int balance) {
		this.accountNumber=accountNumber;
		this.name =name;
		this.balance=balance;
	}
	
	
	public int credit(int amount,BankAccount2 ac) {
		if(amount<0) {
			System.out.println("Invalid credit amount");
			return -1;
		}
		ac.setBalance(ac.getBalance() + amount);
		return balance;
	}
	
	public int debit(int amount,BankAccount2 account) {
		if(account.getBalance() - amount <0) {
			System.out.println("Insufficient Funds");
			return -1;
		}
		account.setBalance(account.getBalance() - amount);
		return account.getBalance();
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
		// TODO Auto-generated method stub
		String temp = "Account Number : "+accountNumber+" , Name : "+name+" , Balance : "+balance;
		return temp;
	}
	
	

}

