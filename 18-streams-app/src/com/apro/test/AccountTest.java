package com.apro.test;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.apro.model.Account;
public class AccountTest {
	public static void main(String[] args) {
		List<Account> accounts = Arrays.asList(new Account(1,"Ramesh",1000),
											   new Account(7,"Suresh",3500),
											   new Account(2,"Priya",2000),
											   new Account(4,"Ramesh",1000));
		
		Optional<Account> minBalanceAccount = accounts.stream()
													.min((account1,account2)-> account1.getBalance()-account2.getBalance());
		if(minBalanceAccount.isPresent())
			System.out.println("Minimum Balance Account is "+minBalanceAccount);
		
		Optional<Account> maxBalanceAccount = accounts.stream()
				.max((account1,account2)-> account1.getBalance()-account2.getBalance());
		
		if(maxBalanceAccount.isPresent())
			System.out.println("Maximum Balance Account is "+maxBalanceAccount);
		System.out.println("Names greater than 6 characters");
		List<Account> accountNameMinLengthSix = accounts.stream()
														.filter((account)-> account.getName().length()>6)
														.collect(Collectors.toList());
		accountNameMinLengthSix.forEach((account)->System.out.println(account.getName()));
		
		Integer balanceSum =accounts.stream()
				.map((account)-> account.getBalance())
				.reduce(0,(balance1,balance2)->balance1+balance2);
		System.out.println("Sum of Balance of all accounts is : "+balanceSum);
	}
}
