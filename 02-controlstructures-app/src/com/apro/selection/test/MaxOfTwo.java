package com.apro.selection.test;

import java.util.Scanner;

public class MaxOfTwo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter two numbers seperated by space :");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		if(number1>number2) {
			System.out.println("Maximum number is :"+number1);
		}
		else {
			System.out.println("Maximum number is :"+number2);
		}
	}

}
