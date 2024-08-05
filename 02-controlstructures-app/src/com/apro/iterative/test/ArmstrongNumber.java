package com.apro.iterative.test;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int temp =number;
		int sumOfDigitsPow =0;
		int pow=0;
		while(temp>0) {
			pow++;
			temp=temp/10;
		}
		temp=number;
		while(temp >0) {
			int digit = temp%10;
			sumOfDigitsPow += Math.pow(digit, pow);
			temp = temp /10;
		}
		if(sumOfDigitsPow ==number) {
			System.out.println("The number "+number+ " is an Armstrong Number");
		}
		else {
			System.out.println("The number "+number+" is not an Armstrong Number");
		}
	}

}
