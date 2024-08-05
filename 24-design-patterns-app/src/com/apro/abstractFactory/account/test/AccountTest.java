package com.apro.abstractFactory.account.test;

import java.util.Scanner;

import com.apro.abstractFactory.account.model.CurrentAccountFactory;
import com.apro.abstractFactory.account.model.IAccount;
import com.apro.abstractFactory.account.model.SavingsAccountFactory;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SavingsAccountFactory savingsAccountFactory = new SavingsAccountFactory();
		CurrentAccountFactory currentAccountFactory = new CurrentAccountFactory();
		IAccount savings = savingsAccountFactory.makeAccount(scanner);
		IAccount current = currentAccountFactory.makeAccount(scanner);
		savings.debit(10000);
		current.debit(10000);
	}

}
