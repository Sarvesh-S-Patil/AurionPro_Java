package com.apro.Model;

public class User {
	private String email;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String email, String password) {
		super();
		this.email = email;
		validateEmail();
		this.password = password;
		validatePassword();
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		validateEmail();
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		validatePassword();
		this.password = password;
	}
	
	public void validateEmail() {
		if(email==null || email.length()==0) {
			throw new InvalidEmailException(1);
		}
		if(email.length()<5 || email.length()>50) {
			throw new InvalidEmailException(2);
		}
		if(!email.contains(".") ||  !email.contains(".")) {
			throw new InvalidEmailException(3);
		}
	}
	
	public void validatePassword() {
		if(password==null || password.length()==0) {
			throw new InvalidPasswordException(1);
		}
		if(password.length() != 8) {
			throw new InvalidPasswordException(2);
		}
		boolean flag1=false;
		boolean flag2=false;
		boolean flag3=false;
		for(int i=0;i<8;i++) {
			char character = password.charAt(i);
			if(character>= 65 && character<=90) {
				flag1=true;
			}
			if(!(character>= 65 && character<=90) && !(character >=97 && character<=122) && !(character>=49 && character <=57)) {
				flag2=true;
			}
			if(character>=49 && character <=57) {
				flag3=true;
			}
		}
		if(!flag1 || !flag2 || !flag3) {
			throw new InvalidPasswordException(3);
		}
	}
	

}
//
//case 1:
//	return "Email cannot be empty of null";
//case 2:
//	return "Length of email should be between 5 to 50 characters";
//case 3:
//	return "Email should contain @ and . ";