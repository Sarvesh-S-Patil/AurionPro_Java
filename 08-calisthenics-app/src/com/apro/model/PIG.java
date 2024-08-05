package com.apro.model;

import java.util.Random;
import java.util.Scanner;

public class PIG {

	public static void main(String[] args) {
		int no_of_turns =0;
		System.out.println("--------Welcome to PIG !-------- ");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int turn_score=0;
		int total_score =0;
		while(true) {
			System.out.println("Roll or hold? (r/h): ");
			char choice = scanner.next().charAt(0);
			if(choice == 'h') {
				total_score+=turn_score;
				System.out.println("Score for turn: "+turn_score);
				System.out.println("Total score: "+total_score);
				turn_score=0;
				no_of_turns++;
				if(total_score>=20) {
					System.out.println();
					System.out.println("You finished in "+no_of_turns);
					break;
				}

			}
			else {
				int roll = random.nextInt(6)+1;
				System.out.println("Die: " + roll);
				if(roll==1) {
					turn_score=0;
					System.out.println("Turn over. No score.");
					no_of_turns++;
				}
				else {
					turn_score+=roll;
				}
			}
			
		}
		
		int roll = random.nextInt(6)+1;
		
	}

}
