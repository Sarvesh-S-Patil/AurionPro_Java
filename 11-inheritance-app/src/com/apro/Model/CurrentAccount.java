package com.apro.Model;

import java.util.Random;
import java.util.Scanner;

public class CurrentAccount extends Account {
	private double overdraft_limit;

	public CurrentAccount(long accountNumber, String name, double balance,double overdraft_limit) {
		super(accountNumber,name, balance);
		this.overdraft_limit=overdraft_limit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overdraft_limit=" + overdraft_limit + ", AccountNumber=" + getAccountNumber()
				+ ", Name =" + getName() + ", Balance=" + getBalance() + "]";
	}

	public double credit(Scanner scanner) {
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
		if(this.getBalance() - amount < 0-overdraft_limit) {
			System.out.println("Insufficient Funds , Maximum avaialble overdraft amount remained is : "+(overdraft_limit-Math.abs(this.getBalance())));
			System.out.println("Your Current Balance Amount "+this.getBalance());
			return -1;
		}
		double currentBalance = this.getBalance();
		this.setBalance(currentBalance - amount);
		System.out.println("Your Current Balance Amount "+this.getBalance());
		return this.getBalance();
	}
	
	
	
}	
