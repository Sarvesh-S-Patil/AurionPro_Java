package com.apro.test;

import java.util.Arrays;
import java.util.Scanner;

import com.apro.model.Board;
import com.apro.model.Game;
import com.apro.model.Player;
import com.apro.model.TicTacToeGame;

public class TicTacToeTest {
	public static void main(String[] args) {
		String player1name = "X";
		String player2name = "O";
		Player player1 = new Player(player1name, 'X');
		Player player2 = new Player(player2name, 'O');
		
		System.out.println("Enter Size of Board : ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner .nextInt();
		scanner.nextLine();
		char[][] board = new char[size][size];
		boardInitializer(board);
		Board boardObj = new Board(board);
		Game ticTacToeGame = new TicTacToeGame(player1,player2,boardObj);
		ticTacToeGame.start();
		
		
	}
	
	public static void boardInitializer(char[][] board) {
		for(char[] row:board) {
			Arrays.fill(row, ' ');
		}
	}

}
