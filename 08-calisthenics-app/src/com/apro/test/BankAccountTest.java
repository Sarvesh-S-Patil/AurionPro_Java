package com.apro.test;

import java.util.Random;
import java.util.Scanner;

import com.apro.model.AccountType;
import com.apro.model.BankAccount;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
		int accountNumber = random.nextInt(9000000) + 1000000;
		accountNumber = random.nextInt(9000000) + 1000000;
		System.out.println("Enter Account Name");
		String name = scanner.nextLine();
		System.out.println("Enter Account Balance");
		int balance = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What Account do you want to create ? ");
		System.out.println("1 -> Savings");
		System.out.println("2 -> Current");
		int account_type = scanner.nextInt();
		AccountType accountType = null;
		if(account_type==1) {
			accountType= accountType.savings;
		}
		else {
			accountType=accountType.current;
		}
		BankAccount account = new BankAccount(accountNumber, name, balance,accountType);
		System.out.println("Account Created Successfully");
		System.out.println(account);
		System.out.println("Your Account Number is : "+accountNumber);
	}

}
