package com.apro.iterative.test.assignment;

import java.util.Scanner;

public class PrimePattern {
	public static void main(String[] args) {
		System.out.println("Enter number of lines : ");
		Scanner scanner = new Scanner(System.in);
		int no_of_lines = scanner.nextInt();
		int number=2;
		for(int i=1;i<=no_of_lines;i++) {
			for(int j=1;j<=i;j++) {
				while(primeChecker(number)!= true) {
					number++;
				}
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
	
	public static boolean primeChecker(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
