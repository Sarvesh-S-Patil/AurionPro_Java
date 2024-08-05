package com.apro.selection.test;

import java.util.Scanner;

public class MaxOfThreeNUmbers {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter three numbers seperated by space :");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int number3 =scanner.nextInt();
		int max =Math.max(number1, number2);
		if(number3 > max) {
			System.out.println("Maximum number is : "+number3);
		}
		else {
			System.out.println("Maximum number is : "+max);
		}
	}
}
