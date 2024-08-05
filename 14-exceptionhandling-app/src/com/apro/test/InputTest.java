package com.apro.test;

import java.util.Scanner;

import com.apro.Model.InvalidEmailException;
import com.apro.Model.InvalidPasswordException;
import com.apro.Model.User;

public class InputTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Email : ");
		String email = scanner.nextLine();
		System.out.println("Enter your password :");
		String password=scanner.nextLine();
		try {
			User user = new User(email,password);
		}
		catch(InvalidEmailException exception) {
			System.out.println(exception.getMessage());
		}
		catch(InvalidPasswordException exception) {
			System.out.println(exception.getMessage());
		}
	}


}

