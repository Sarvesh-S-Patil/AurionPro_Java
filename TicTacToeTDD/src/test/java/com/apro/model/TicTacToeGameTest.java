package com.apro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TicTacToeGameTest {
	TicTacToeGame ticTacToe;
	Player player1;
	Player player2;
	@BeforeEach
	void init(){
		player1= new Player("X", 'X');
		player2 = new Player("O", 'O');
		Board boardObj = new Board(new char[3][3]);
		ticTacToe= new TicTacToeGame(player1, player2,boardObj);
		
	}

	@Test
	void testHasWon() {
		char[][] board = ticTacToe.boardObj.getBoard();
		board[0][0]='X';
		board[0][1]='X';
		board[0][2]='X';
		assertTrue(ticTacToe.hasWon(player1, board), "has won method should check if a player has won");
		board = ticTacToe.boardObj.getBoard();
		board[0][0]='O';
		board[0][1]='O';
		board[0][2]='O';
		assertTrue(ticTacToe.hasWon(player2, board), "has won method should check if a player has won");
		board = ticTacToe.boardObj.getBoard();
		board[0][0]='X';
		board[0][1]='O';
		board[0][2]='X';
		assertFalse(ticTacToe.hasWon(player1, board), "has won method should check if a player has won");
		
		board[0][0]='X';
		board[1][1]='X';
		board[2][2]='X';
		assertTrue(ticTacToe.hasWon(player1, board));
		
		board[0][2]='O';
		board[1][1]='O';
		board[2][0]='O';
		assertTrue(ticTacToe.hasWon(player2, board));
	}

	@Test
	void testCheckInput() {
		char[][] board = ticTacToe.boardObj.getBoard();
		board[0][0]='X';
		assertFalse(ticTacToe.checkInput(0, 0));
		assertFalse(ticTacToe.checkInput(4, 4));
	}

}
