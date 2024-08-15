package com.apro.test;

import java.util.Scanner;

import com.apro.model.Board;
import com.apro.model.Cell;
import com.apro.model.Game;
import com.apro.model.MarkType;
import com.apro.model.Player;
import com.apro.model.ResultAnalyzer;
import com.apro.model.ResultType;

public class TicTacToeTest {
	
	public static void main(String[] args) {
		Player[] players = new Player[2];
		players[0] = new Player(MarkType.X, "X");
		players[1]= new Player(MarkType.O, "O");
		
		Scanner scanner = new Scanner(System.in);
		Game game = new Game(players, players[0],ResultType.PROGRESS);
		
		while(game.analyzeResult()== ResultType.PROGRESS) {
			System.out.println("Player "+game.getCurrentPLayer()+" enter location [1-9] :");
			int loc= scanner.nextInt()-1;
			game.play(loc);
			
		}
		if(game.getResult()==ResultType.WIN) {
			System.out.println("Player "+game.getCurrentPLayer().getPlayerName()+ " has won the game.");
			return;
		}
		System.out.println("Game is draw");
			
	}

}
