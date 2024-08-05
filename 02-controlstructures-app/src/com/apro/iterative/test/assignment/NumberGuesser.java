package com.apro.iterative.test.assignment;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int random_number = random.nextInt(100)+1;	// plus one to keep range 1-100
		int tries =1;
		while(true) {
			System.out.println("Guess a number between 1 to 100 : ");
			int guess = scanner.nextInt();
			if(guess==random_number) {
				System.out.println("--------------------------------");
				System.out.println("Congrats ! You guessed it right.");
				System.out.println("Number of tries :"+tries);
				break;
			}
			else if(guess<random_number) {
				System.out.println("Sorry,Too Low");
			}
			else {
				System.out.println("Sorry,Too High");
			}
			System.out.println("--------------------------------");
			tries++;
		}

		
		
	}
}
