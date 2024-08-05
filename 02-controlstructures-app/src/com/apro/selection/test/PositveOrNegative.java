package com.apro.selection.test;
import java.util.Scanner;

public class PositveOrNegative {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = scanner.nextInt();
		if(number==0) {
			System.out.println("Number is zero");
		}
		else if(number<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is positive");
		}
	}
}
