package com.apro.iterative.test;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		if(number ==0) {
			System.out.println("Factorial of "+number + " is  1");
			return ;
		}
		int factorial =1;
		for(int i=number;i>=1;i--) {
			factorial = factorial*i;
		}
		System.out.println("Factorial of " + number + " is "+factorial);
	}

}
