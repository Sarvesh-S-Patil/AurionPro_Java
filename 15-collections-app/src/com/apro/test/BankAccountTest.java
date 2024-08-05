package com.apro.test;
import com.apro.model.BankAccount;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.apro.model.BankAccount;

//3. create a class BankAccount(accountNumber, name, balance). Create getter and setters. Also add credit(amount) and debit(amount) methods    with all possible scenarios and proper error messages. Create a test class.
//Accept values from user.
public class BankAccountTest {
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<BankAccount> accounts = new ArrayList<>();
		int choice =-1;
		while(choice != 4) {
			choice();
			choice=scanner.nextInt();
			if(choice ==1) {
		        Random random = new Random();
				int accountNumber = random.nextInt(9000000) + 1000000;
				System.out.println("Enter Account Name");
				String name = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Enter Account Balance");
				int balance = scanner.nextInt();
				scanner.nextLine();
				BankAccount account = new BankAccount(accountNumber, name, balance);
				System.out.println("Account Created Successfully");
				System.out.println("Your Account Number is : "+accountNumber);
				accounts.add(account);
			}
			else if(choice ==2) {
				System.out.println("Enter Account Number");
				int accountNumber = scanner.nextInt();
				scanner.nextLine();
				BankAccount account =  getAccount(accounts, accountNumber);
				if(account==null) {
					System.out.println("Invalid Account Number");
					continue;
				}
				System.out.println("Enter credit amount : ");
				int amount = scanner.nextInt();
				int balance = account.credit(amount, account);
				if(balance ==-1) {
					System.out.println("Avaialable balance is : "+account.getBalance());
				}
				else {
					System.out.println("Credited successfully");
					System.out.println("Avaialable balance is : "+account.getBalance());
				}
				
			}
			else if(choice ==3) {
				System.out.println("Enter Account Number");
				int accountNumber = scanner.nextInt(); 
				scanner.nextLine();
				BankAccount account = getAccount(accounts, accountNumber);
				if(account==null) {
					System.out.println("Invalid Account Number");
					continue;
				}
				System.out.println("Enter debit amount : ");
				int amount = scanner.nextInt();
				int balance = account.debit(amount, account);
				if(balance ==-1) {
					System.out.println("Avaialable balance is : "+account.getBalance());
				}
				else {
					System.out.println("Debited successfully");
					System.out.println("Avaialable balance is : "+account.getBalance());
				}
			}
			System.out.println("--------------------------------------");
		}
		
	}
	 
	public static void choice() {
		System.out.println("Select from the following choices : ");
		System.out.println("1 -> Create New Bank Account ");
		System.out.println("2 -> Deposit Money");
		System.out.println("3 -> Withdraw Money");
		System.out.println("4 -> Exit");

	}

	public static BankAccount getAccount(ArrayList<BankAccount> accounts,int accountNumber) {
		for(BankAccount account:accounts) {
			if(account.getAccountNumber()==accountNumber) {
				return account;
			}
		}
		return null;
	}
}
