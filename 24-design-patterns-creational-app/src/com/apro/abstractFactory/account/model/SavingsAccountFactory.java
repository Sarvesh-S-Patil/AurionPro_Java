package com.apro.abstractFactory.account.model;

import java.util.Scanner;

public class SavingsAccountFactory implements AccountFactory{

	@Override
	public IAccount makeAccount(Scanner scanner) {
		System.out.println("Enter Account Number : ");
		long accountNumber= scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter Account Name : ");
		String accountName = scanner.nextLine();
		System.out.println("Enter Account Balance : ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		//System.out.println("Enter Account Minimum Balance: ");
		int minimumBalance = 5000;
		//scanner.nextLine();
		return new SavingsAccount(accountNumber, accountName, balance, minimumBalance);
	}


}