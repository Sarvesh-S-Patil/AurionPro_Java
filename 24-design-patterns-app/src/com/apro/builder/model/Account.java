package com.apro.builder.model;

public class Account {
	private long accountNumber;
	private String accountName;
	private int accountBalance;
	private String address; //optional
	
	public Account (AccountBuilder accountBuilder) {
		super();
		this.accountNumber = accountBuilder.accountNumber;
		this.accountName = accountBuilder.accountName;
		this.accountBalance = accountBuilder.accountBalance;
		this.address = accountBuilder.address;
	}
	
	public static class AccountBuilder {
		private long accountNumber;
		private String accountName;
		private int accountBalance;
		private String address;
		
		

		public AccountBuilder(long accountNumber, String accountName, int accountBalance) {
			super();
			this.accountNumber = accountNumber;
			this.accountName = accountName;
			this.accountBalance = accountBalance;
		}

		public AccountBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Account build() {
			return new Account(this);
		}
		
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + ", address=" + address + "]";
	}
	
	
	

}
