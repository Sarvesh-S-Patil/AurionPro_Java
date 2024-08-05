package com.apro.abstractFactory.account.model;

import java.util.Scanner;

public class CurrentAccountFactory  implements AccountFactory{

	@Override
	public IAccount makeAccount(Scanner scanner) {
		// TODO Auto-generated method stub
		System.out.println("Enter Account Number : ");
		long accountNumber= scanner.nextLong();
		scanner.nextLine();
		System.out.println("Enter Account Name : ");
		String accountName = scanner.nextLine();
		System.out.println("Enter Account Balance : ");
		int balance = scanner.nextInt();
		scanner.nextLine();
	
		int overDraftLimit = 10000;
		scanner.nextLine();
		return new CurrentAccount(accountNumber, accountName, balance, overDraftLimit);
	}

}
