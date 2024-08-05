package com.apro.creational.factory.test;

import com.apro.creational.factory.model.AccountFactory;
import com.apro.creational.factory.model.AccountType;

import com.apro.creational.factory.model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		IAccount savingsAccount = AccountFactory.makeAccount(AccountType.Savings);
		IAccount currentAccount = AccountFactory.makeAccount(AccountType.Current);
		savingsAccount.credit(1000);
		savingsAccount.debit(100);
		currentAccount.credit(10000);
		currentAccount.debit(2000);
	}

}
