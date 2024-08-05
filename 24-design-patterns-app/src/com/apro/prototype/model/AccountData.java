package com.apro.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class AccountData implements Cloneable {
	
	private static List<Account> accountList;

	static {
		accountList= new ArrayList<Account>();
		Account account1 = new Account(10, "Ramesh",10000, "Andheri");
		Account account2 = new Account(12, "Sureesh",1000, "Ghatkopar");
		accountList.add(account1);
		accountList.add(account2);
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	
	@Override
	public  List<Account> clone() throws CloneNotSupportedException {
		List<Account> dummyAccountList = new ArrayList<Account>();
		for(Account account : accountList) {
			dummyAccountList.add(account);
		}
		return dummyAccountList;
	}
	

}
