package com.apro.iterative.test;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i=2;
		boolean isPrime = true;
		if(number ==1) {
			System.out.println("1 is neither Prime nor Composite");
			return;
		}
		if(number ==2) {
			System.out.println("2 is a Prime Number");
			return;
		}
		while(i<=number/2) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println("The number "+number + " is a Prime Number. ");
		}
		else {
			System.out.println("The number "+number + " is not a Prime Number. ");
		}
	}
}
