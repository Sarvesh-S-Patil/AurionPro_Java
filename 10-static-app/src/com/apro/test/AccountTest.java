package com.apro.test;

import java.util.Scanner;

import com.apro.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			
			System.out.println("Create a new Account : ");
			System.out.println("1 -> YES");
			System.out.println("2 -> NO");
			Account account = new Account();
			int choice = scanner.nextInt();
			if(choice == 2) {
				return;
			}
		}
	}

}
