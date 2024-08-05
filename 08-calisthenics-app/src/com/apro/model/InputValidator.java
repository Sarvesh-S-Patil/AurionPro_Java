package com.apro.model;

import java.util.Scanner;

public class InputValidator {
	private String userName;
	private int password;
	private String email;
	

	private static boolean validateEmail(String email) {
		// TODO Auto-generated method stub
		if(checkLength(email, 5, 50)==false) {
			return false;
		}
		boolean check1=email.contains(".");
		boolean check2=email.contains("@");
		if(check1==false || check2==false) {
			return false;
		}
		return true;
	}
	
	public static boolean checkLength(String str,int low, int high) {
		if(str==null) {
			return false;
		}
		if(str.length()<low || str.length()>high) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "InputValidator [userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
}
