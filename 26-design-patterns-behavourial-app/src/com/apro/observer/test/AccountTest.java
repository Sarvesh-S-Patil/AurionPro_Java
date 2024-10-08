package com.apro.observer.test;

import java.util.Scanner;

import com.apro.observer.model.Account;
import com.apro.observer.model.EmailNotifier;
import com.apro.observer.model.SMSNotifer;
import com.apro.observer.model.WhatsappNotifer;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1000,"Ramesh",10000);
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		while(choice!=5) {
			System.out.println("Enter your choice : ");
			System.out.println("1. Create Account");
			System.out.println("2. Credit");
			System.out.println("3. Debit");
			System.out.println("4. Add Notifier");
			System.out.println("5. Exit");
			choice =scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 1:
					account = new Account(1000,"Ramesh",10000);
					continue;
				case 2:
					System.out.println("Enter Credit Amount :");
					int amount = scanner.nextInt();
					scanner.nextLine();
					account.credit(amount);
					continue;
				case 3:
					System.out.println("Enter Debit Amount :");
					amount = scanner.nextInt();
					scanner.nextLine();
					account.debit(amount);
					continue;
				case 4:
					System.out.println("Enter notifier to add (1-3) : ");
					System.out.println("1. Email Notifier ");
					System.out.println("2. SMS Notifer");
					System.out.println("3. Whatsapp Notifier");
					int notifierChoice = scanner.nextInt();
					scanner.nextLine();
					addNotifer(notifierChoice,account);
					continue;
				case 5:
					break;
					
			}
		}
		
	}

	private static void addNotifer(int notifierChoice, Account account) {
		// TODO Auto-generated method stub
		switch(notifierChoice) {
			case 1 :
				account.addNotifier(new EmailNotifier());
				break;
			case 2:
				account.addNotifier(new SMSNotifer());
				break;
			case 3:
				account.addNotifier(new WhatsappNotifer());
				break;
		}
		
	}


}
