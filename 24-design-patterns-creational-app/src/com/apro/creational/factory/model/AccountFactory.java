package com.apro.creational.factory.model;

public class AccountFactory {
	
	public static IAccount makeAccount(AccountType accountType) {
		IAccount account = null;
		if(accountType==AccountType.Savings) {
			account = new SavingsAccount(1000);
			return account;
		}
		return account = new CurrentAccount(1000);
	}

}
