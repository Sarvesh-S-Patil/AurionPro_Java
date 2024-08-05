package com.apro.iterative.test;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		int reverse =0;
		int temp =number;
		while(temp>0) {
			int digit = temp%10;
			reverse = reverse*10+digit;
			temp=temp/10;
		}
		System.out.println("Reverse of number "+number+ " is : "+reverse);
	}

}
