package com.apro.prototype.test;

import java.util.List;

import com.apro.prototype.model.Account;
import com.apro.prototype.model.AccountData;

public class AccountPrototypeTest {


	public static void main(String[] args) {
		AccountData accounts = new AccountData();
		
		try {
			List<Account> accountsCopy = accounts.clone();
			accountsCopy.add(new Account());
			System.out.println("Original list");
			accounts.getAccountList()
					.forEach((account)-> System.out.println(account));
			System.out.println("Cloned List");
			accountsCopy.forEach((account)-> System.out.println(account));
		}
		 catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
