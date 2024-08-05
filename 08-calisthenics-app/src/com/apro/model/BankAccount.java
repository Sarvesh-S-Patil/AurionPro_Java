package com.apro.model;
//3. create a class BankAccount(accountNumber, name, balance). Create getter and setters. Also add credit(amount) and debit(amount) methods    with all possible scenarios and proper error messages. Create a test class.
//Accept values from user.
public class BankAccount {
	private int accountNumber;
	private String name;
	private int balance;
	private AccountType accountType;
	
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public BankAccount(int accountNumber, String name, int balance, AccountType accountType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}



	public int credit(int amount,BankAccount account) {
		if(amount<0) {
			System.out.println("Invalid credit amount");
			return -1;
		}
		account.balance += amount;
		return balance;
	}
	
	public int debit(int amount,BankAccount account) {
		if(account.balance - amount <0) {
			System.out.println("Insufficient Funds");
			return -1;
		}
		account.balance -=amount;
		return account.balance;
	}



	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public AccountType getAccountType() {
		return accountType;
	}



	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	

}
