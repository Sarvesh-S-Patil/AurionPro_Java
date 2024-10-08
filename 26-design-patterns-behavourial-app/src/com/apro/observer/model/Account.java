package com.apro.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private List<INotifier> notifiers ;
	
	public Account(long accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		notifiers= new ArrayList<INotifier>();
	}
	
	public void credit(double amount) {
		if(amount<0) {
			System.out.println("Invalid credit amount");
			return;
		}
		double previousBalance=balance;
		balance += amount;
		for(INotifier notifier: notifiers) {
			notifier.notify(this,"credit",previousBalance);
		}
	}
	
	public void debit(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient balance , available balance is : "+balance);
			return;
		}
		double previousBalance=balance;
		balance-=amount;
		for(INotifier notifier: notifiers) {
			notifier.notify(this,"debit",previousBalance);
		}
		
	}
	
	public void addNotifier(INotifier notifer) {
		notifiers.add(notifer);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}
	
	
	
	
}
