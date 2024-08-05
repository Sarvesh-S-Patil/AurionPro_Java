package com.apro.test;

import java.util.Scanner;

import com.apro.model.CricketPlayer;

public class CricketPlayerTest {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Players : ");
		int no_of_players =scanner.nextInt();
		CricketPlayer[] players= new CricketPlayer[no_of_players];
		for(int i=0;i<no_of_players;i++) {
			System.out.println("Enter Details of Player : ");
			System.out.println("Enter Player ID : ");
			int playerId =scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Player Name : ");
			String name=scanner.nextLine();
			System.out.println("Enter Number of Matches played : ");
			int numberOfMatches=scanner.nextInt();
			System.out.println("Enter Runs Scored : ");
			int runs=scanner.nextInt();
			System.out.println("Enter Number of Wickets : ");
			int numberOfWickets=scanner.nextInt();
			players[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);
			
		}
		
			sortPlayers(players);
			System.out.println("Sorted Order of Player is : ");
			display(players);
	}
	
	private static void display(CricketPlayer[] players) {
		for(CricketPlayer player :players) {
			System.out.println("Player Name : "+player.getName());
			System.out.println("Average of Player : "+player.calculateAverage());
			
		}
		
	}

	public static void sortPlayers(CricketPlayer[] players) {
		for(int i=0;i<players.length;i++) {
			for(int j=1;j<players.length-i;j++) {
				if(players[j-1].calculateAverage()  < players[j].calculateAverage()) {
					CricketPlayer temp = players[j-1];
					players[j-1]=players[j];
					players[j]=temp;
				}
			}
		}
		
	}

}

