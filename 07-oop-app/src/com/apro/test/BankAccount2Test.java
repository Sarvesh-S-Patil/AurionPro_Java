package com.apro.test;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.apro.model.BankAccount;
import com.apro.model.BankAccount2;

public class BankAccount2Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice =-1;
		BankAccount2[] accounts= new BankAccount2[1];
		int account_count=0;
		while(choice != 5) {
			choice();
			choice=scanner.nextInt();
			switch(choice) {
				case 1:
					System.out.println("How many Bank Accounts do you want to create? ");
					account_count =  scanner.nextInt();
					scanner.nextLine();
					accounts=new BankAccount2[account_count];
			        Random random = new Random();
					for(int i=0;i<account_count;i++) {
						int accountNumber = random.nextInt(9000000) + 1000000;
						
						System.out.println("Enter Account Name");
						String name = scanner.nextLine();
						
						System.out.println("Enter Account Balance");
						int balance = scanner.nextInt();
						scanner.nextLine();
						accounts[i] = new BankAccount2(accountNumber, name, balance);
						System.out.println("Account Created Successfully");
						System.out.println("Your Account Number is : "+accountNumber);
						System.out.println("--------------------------------------");
					}
					break;
				case 2:
					System.out.println("Enter Account Number");
					int accountNumber = scanner.nextInt();
					scanner.nextLine();
					if(accountNumber>=account_count) {
						System.out.println("Invalid Account Number");
						continue;
					}
					BankAccount2 ac = accounts[accountNumber];
					System.out.println("Enter credit amount : ");
					int amount = scanner.nextInt();
					scanner.nextLine();
					int balance = ac.credit(amount, ac);
					if(balance ==-1) {
						System.out.println("Avaialable balance is : "+ac.getBalance());
					}
					else {
						System.out.println("Credited successfully");
						System.out.println("Avaialable balance is : "+ac.getBalance());
					}
					break;
				case 3:
					System.out.println("Enter Account Number");
					accountNumber = scanner.nextInt();
					scanner.nextLine();
					if(accountNumber>=account_count) {
						System.out.println("Invalid Account Number");
						continue;
					}
					ac= accounts[accountNumber];
					System.out.println("Enter debit amount : ");
					amount = scanner.nextInt();
					balance = ac.debit(amount, ac);
					if(balance ==-1) {
						System.out.println("Avaialable balance is : "+ac.getBalance());
					}
					else {
						System.out.println("Debited successfully");
						System.out.println("Avaialable balance is : "+ac.getBalance());
					}
					break;
					
				case 4:
					BankAccount2 max_account = getMaximumBalanceAccount(accounts);
					System.out.println("Maximum Balance Account is - ");
					System.out.println(max_account.toString());
			}
			System.out.println("--------------------------------------");
		}
	}

	
	public static void choice() {
		System.out.println("Select from the following choices : ");
		System.out.println("1 -> Create N New Bank Accounts ");
		System.out.println("2 -> Deposit Money");
		System.out.println("3 -> Withdraw Money");
		System.out.println("4 -> Get Maximum Balance Account");
		System.out.println("5 -> Exit");

	}
	
	public static BankAccount2 getMaximumBalanceAccount(BankAccount2[] accounts ) {
		int max = Integer.MIN_VALUE;
		BankAccount2 max_account = null;
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i].getBalance()>max) {
				max_account=accounts[i];
				max= max_account.getBalance();
			}
		}
		return max_account;
	}
}
