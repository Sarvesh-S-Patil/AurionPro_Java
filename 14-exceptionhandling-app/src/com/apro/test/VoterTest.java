package com.apro.test;

import java.util.Scanner;

import com.apro.Model.InvalidAgeException;
import com.apro.Model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Voter Id : ");
			int id = scanner.nextInt();
			System.out.println("Enter Voter Age : ");
			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Voter  Name : ");
			String name = scanner.nextLine();
			Voter voter = new Voter(id,age,name);
			System.out.println(voter.toString());
		}
		catch(InvalidAgeException exception) {
			System.out.println(exception.getMessage());
		}
		
	}
}
