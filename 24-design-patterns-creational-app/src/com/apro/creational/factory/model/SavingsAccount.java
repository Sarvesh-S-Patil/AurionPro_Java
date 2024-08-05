package com.apro.creational.factory.model;

public class SavingsAccount implements IAccount {
	private double balance;

	public SavingsAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public void credit(int amount) {
		// TODO Auto-generated method stub
		if(amount<0) {
			System.out.println("Credit amount cannot be negative");
			return;
		}
		balance+=amount;
		System.out.println("Savings Account Credit");
		System.out.println("Credited successfully, available balance is : "+balance);
		
	}

	@Override
	public void debit(int amount) {
		// TODO Auto-generated method stub
		
		if(amount>balance) {
			System.out.println("Insufficent balance");
			return;
		}
		balance-=amount;
		System.out.println("Savings Account Debit");
		System.out.println("Debit succesful, available balance is : "+balance);
		
	}

}