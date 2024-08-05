package com.apro.test;
import java.util.Random;

import java.util.Scanner;

import com.apro.Model.Account;
import com.apro.Model.SavingsAccount;
import com.apro.Model.CurrentAccount;


public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice =-1;
		SavingsAccount savingsAccount = null;
		CurrentAccount currentAccount =null;
		boolean savings = true;
		while(choice != 4) {
			choice();
			choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("What type of account do you want to create ? ");
					System.out.println(" 1-> Savings");
					System.out.println(" 2-> Current");
					int account_type = scanner.nextInt();
					scanner.nextLine();
			        Random random = new Random();
					long accountNumber = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
					System.out.println("Enter Account Name");
					String name = scanner.nextLine();
						
					System.out.println("Enter Account Balance");
					double balance = scanner.nextInt();
					scanner.nextLine();
					
					if(account_type==1) {
						System.out.println("Enter minimum balance");
						double minimumBalance = scanner.nextDouble();
						savingsAccount = createSavingsAccount(accountNumber, name, balance,minimumBalance);
						break;
					}
					savings=false;
					System.out.println("Enter overdraft limit : ");
					double limit = scanner.nextDouble();
					currentAccount = createCurrentAccount(accountNumber, name, balance,limit);
					break;
					
				case 2:
					balance=-1;
					if(savings) {
						balance =savingsAccount.credit(scanner);
						transactionStatus(balance);
						break;
					}
					balance = currentAccount.credit(scanner);
					transactionStatus(balance);
					break;
				case 3:
					balance = -1;
					if(savings) {
						balance = savingsAccount.debit(scanner);
						transactionStatus(balance);
						break;
					}
					balance = currentAccount.debit(scanner);
					transactionStatus(balance);
					break;
			}
			
			System.out.println("--------------------------------------");
		}
		System.out.println("Thank you for banking with us ");
	}

	public static void choice() {
		System.out.println("Select from the following choices : ");
		System.out.println("1 -> Create a New Bank Account ");
		System.out.println("2 -> Deposit Money");
		System.out.println("3 -> Withdraw Money");
		System.out.println("4 -> Exit");

	}
	
	public static SavingsAccount createSavingsAccount(long accountNumber,String name,double balance,double minimumBalance) {	
		SavingsAccount account = new SavingsAccount(accountNumber, name, balance,minimumBalance);
		System.out.println("Account Created Successfully");
		System.out.println("Your Account Number is : "+accountNumber);
		System.out.println("--------------------------------------");
		return account;
	}
	
	private static CurrentAccount createCurrentAccount(long accountNumber, String name,double balance,double overdraftLimit) {
		
		CurrentAccount account = new CurrentAccount(accountNumber, name, balance,overdraftLimit);
		System.out.println("Account Created Successfully");
		System.out.println("Your Account Number is : "+accountNumber);
		System.out.println("--------------------------------------");
		return account;
	}
	
	public static void transactionStatus(double value) {
		if(value==-1) {
			System.out.println("Transaction Failed");
			return;
		}
		System.out.println("Transaction Successful");
	}
}
