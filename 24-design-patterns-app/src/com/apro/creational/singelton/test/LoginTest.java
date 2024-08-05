package com.apro.creational.singelton.test;

import com.apro.creational.singelton.model.Login;

public class LoginTest {
	public static void main(String[] args) {
		Login login1 = Login.getLogin();
		login1.status();
		System.out.println(login1.hashCode());
		Login login2 = Login.getLogin();
		login2.status();
		System.out.println(login2.hashCode());
	}

}
