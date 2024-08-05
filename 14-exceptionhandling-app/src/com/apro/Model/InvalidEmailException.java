package com.apro.Model;

public class InvalidEmailException extends RuntimeException{
	private int val;
	
	public InvalidEmailException(int val) {
		super();
		this.val = val;
	}

	public String getMessage() {
		switch(val) {
			case 1:
				return "Email cannot be empty of null";
			case 2:
				return "Length of email should be between 5 to 50 characters";
			case 3:
				return "Email should contain @ and . ";
		}
		return " ";
	}
}
