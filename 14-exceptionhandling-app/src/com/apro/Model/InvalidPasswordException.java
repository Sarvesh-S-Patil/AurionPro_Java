package com.apro.Model;

public class InvalidPasswordException extends RuntimeException{
	private int val;
	
	
	public InvalidPasswordException(int val) {
		super();
		this.val = val;
	}


	public String getMessage() {
			switch(val) {
				case 1:
					return "Password cannot be null or empty";
				case 2:
					return "Password Length should be 8 characters";
				case 3:
					return "Password should contain one capital letters, one special character and 1 digit";
			}
			return " ";
	}

}
