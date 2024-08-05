package com.apro.selection.test;

import java.util.Scanner;

public class VowelChecker {
	public static void main(String[] args) {
		System.out.println("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
		}
	}

}
