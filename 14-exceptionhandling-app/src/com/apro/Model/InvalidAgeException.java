package com.apro.Model;

public class InvalidAgeException  extends RuntimeException{
	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMessage() {
		return "Invalid Age. Age must be aboove 18";
	}
}
