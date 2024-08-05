package com.apro.observer.model;

public interface INotifier {
	public void notify(Account account,String operation, double previousBalance);
	
}
