package com.apro.iterative.test;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i=1;
		int sumOfDivisors=0;
		while(i<=number/2) {
			if(number%i==0) {
				sumOfDivisors+=i;		
			}
			i++;
		}
		if(sumOfDivisors==number) {
			System.out.println("The number "+number+" is a perfect number. ");
		}
		else {
			System.out.println("The number "+number+" is not a perfect number. ");
		}
	}
}
