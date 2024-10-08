package com.apro.facade.model;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeTest {
	public static void main(String[] args) {
		String player1name = "X";
		String player2name = "O";
		Player player1 = new Player(player1name, 'X');
		Player player2 = new Player(player2name, 'O');
		
		Board board = new Board(new char[3][3]);
		boardInitializer(board.getBoard());
		
		Game ticTacToeGame = new TicTacToeGame(player1,player2,board);
		ticTacToeGame.start();
		
		
	}
	
	public static void boardInitializer(char[][] board) {
		for(char[] row:board) {
			Arrays.fill(row, ' ');
		}
	}

}
