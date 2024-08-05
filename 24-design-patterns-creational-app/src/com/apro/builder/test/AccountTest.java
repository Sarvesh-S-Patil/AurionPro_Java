package com.apro.builder.test;

import com.apro.builder.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account account =  new Account.AccountBuilder(1000,"Ramesh",1000).setAddress("Andheri").build();
		
		
		
		System.out.println(account);
		//System.out.println(account2);
	}

}
