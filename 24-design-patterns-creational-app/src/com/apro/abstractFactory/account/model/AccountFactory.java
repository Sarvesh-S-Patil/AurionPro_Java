package com.apro.abstractFactory.account.model;

import java.util.Scanner;

public interface AccountFactory {
	
	public IAccount makeAccount(Scanner scanner);

}
