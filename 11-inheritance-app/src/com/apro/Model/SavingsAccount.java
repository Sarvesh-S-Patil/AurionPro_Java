package com.apro.Model;

import java.util.Random;

import java.util.Scanner;



public class SavingsAccount extends Account {
	private static double min_balance=5000;

	public SavingsAccount(long accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

	public SavingsAccount(long accountNumber, String name, double balance,double min_balance) {
		super(accountNumber, name,balance);
		this.min_balance = min_balance;
	}

	public double getMin_balance() {
		return min_balance;
	}

	public void setMin_balance(double min_balance) {
		this.min_balance = min_balance;
	}
	
	public static SavingsAccount createSavingsAccount(Scanner scanner) {
		Random random = new Random();
		long accountNumber = 1000000000L + random.nextLong() % (9000000000L);
		System.out.println("Enter Account Name");
		String name = scanner.nextLine();
		System.out.println("Enter Account Balance");
		double balance = scanner.nextInt();
		scanner.nextLine();
		if(balance<min_balance) {
			System.out.println("Minimum Balance required is : "+min_balance);
			return null;
		}
		SavingsAccount account = new SavingsAccount(accountNumber, name, balance);
		System.out.println("Account Created Successfully");
		System.out.println("Your Account Number is : "+accountNumber);
		System.out.println("--------------------------------------");
		return account;
	}
	
	public double credit (Scanner scanner) {
		System.out.println("Enter credit amount : ");
		int amount = scanner.nextInt();
		scanner.nextLine();
		if(amount<0) {
			System.out.println("Invalid credit amount");
			return -1;
		}
		double currentBalance = this.getBalance();
		this.setBalance(currentBalance+=amount);
		System.out.println("Your Current Balance Amount "+this.getBalance());
		return this.getBalance();
	}
	
	public double debit(Scanner scanner) {
		System.out.println("Enter debit amount : ");
		double amount = scanner.nextInt();
		if(this.getBalance() - amount < min_balance) {
			System.out.println("Minimum Balance required is : "+this.min_balance);
			System.out.println("Your Current Balance Amount "+this.getBalance());
			return -1;
		}
		double currentBalance = this.getBalance();
		this.setBalance(currentBalance - amount);
		System.out.println("Your Current Balance Amount "+this.getBalance());
		return this.getBalance();
		
	}

	@Override
	public String toString() {
		return "SavingsAccount [min_balance=" + min_balance + ", AccountNumber=" + getAccountNumber()
				+ ", Name=" + getName() + ", Balance=" + getBalance() + "]";
	}
	
}
