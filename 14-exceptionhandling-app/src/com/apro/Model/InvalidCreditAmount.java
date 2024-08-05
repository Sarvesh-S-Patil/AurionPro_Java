package com.apro.Model;

public class InvalidCreditAmount  extends RuntimeException{
	public String getMessage() {
		return "Credit Amount cannot be negative";
	}
}
