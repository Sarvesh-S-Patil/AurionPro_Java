package com.apro.observer.model;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account account,String operation,double previousBalance) {
		System.out.println("Email Notifier -");
		System.out.println("Balance before transaction :"+previousBalance);
		System.out.println("Account "+operation+" successfully");
		System.out.println("Updated account details are -");
		System.out.println(account);
		
	}

}
