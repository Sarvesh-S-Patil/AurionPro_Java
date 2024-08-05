package com.apro.iterative.test;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		int sumOfDigits= 0;
		while(number>0) {
			int digit = number %10;
			sumOfDigits += digit;
			number=number/10;
		}
		System.out.println("Sum of Digits of number is :"+ sumOfDigits);
	}

}
