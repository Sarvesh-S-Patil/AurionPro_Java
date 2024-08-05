package com.apro.test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		number1=scanner.nextInt();
		number2=scanner.nextInt();
		System.out.println("Choose 1 to 4 :");
		System.out.println("1 -> Addition");
		System.out.println("2 -> Addition");
		System.out.println("3 -> Addition");
		System.out.println("4 -> Addition");
		int choice = scanner.nextInt();
		switch(choice) {
			case 1:
				System.out.println("Addition : " + addition(number1,number2));
			case 2:
				System.out.println("Subtraction : " + subtraction(number1,number2));
			case 3:
				System.out.println("Multiplication : " + multiplication(number1, number2));
			case 4:
				System.out.println("Division : " + division(number1,number2));;
		}

		
	}
	
	private static int addition(int number1,int number2) {
		return number1+number2;
	}
	private static int subtraction(int number1,int number2) {
		return number1-number2;
	}
	private static int multiplication(int number1,int number2) {
		return number1*number2;
	}
	private static int division(int number1,int number2) {
		return number1/number2;
	}
	
}
