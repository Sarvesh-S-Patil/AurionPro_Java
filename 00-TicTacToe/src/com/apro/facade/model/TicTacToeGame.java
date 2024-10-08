package com.apro.facade.model;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeGame implements Game{
	Board boardObj ;
	Player player1;
	Player player2;
	
	public TicTacToeGame(Player player1, Player player2,Board boardObj) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.boardObj=boardObj;

	}

	@Override
	public void start() {
		char[][] board = boardObj.getBoard();
		boolean isOver = false;
		boolean player1Active= true;
		Scanner scanner = new Scanner(System.in);
		while(isOver==false) {
			if(player1Active) {
				System.out.println("Player X Enter grid row [1-3]  and column [1-3]: ");
				int row = scanner.nextInt()-1;
				int column = scanner.nextInt()-1;
				if(checkInput(row, column)==false) {
					System.out.println("The given row,column input is already marked , enter other values");
					continue;
				}
				board[row][column]= 'X';
				boardObj.printBoard();
				if(hasWon(player1,board)){
					System.out.println("-----------------------");
					System.out.println();
					System.out.println(player1.getPlayerName()+" has won ");
					stop();
					return;
				}
				player1Active=false;
				if(isDraw())
					stop();
				continue;
			}
			System.out.println("Player O Enter grid row [1-3]  and column [1-3]: ");
			int row = scanner.nextInt()-1;
			int column = scanner.nextInt()-1;
			if(checkInput(row, column)==false) {
				System.out.println("The given row,column input is already marked , enter other values");
				continue;
			}
			board[row][column]= 'O';
			boardObj.printBoard();
			if(hasWon(player2,board)){
				System.out.println("-----------------------");
				System.out.println();
				System.out.println(player2.getPlayerName()+" has won ");
				stop();
				return;
			}
			if(isDraw())
				stop();
			player1Active=true;
			
			
		}
		
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Game Over");
		
		
	}
	
	public boolean hasWon(Player player,char[][] board) {
		char symbol = player.getSymbol();
		if(board[0][0]== symbol && board[1][1]==symbol && board[2][2]==symbol)
			return true;
		if(board[0][2]==symbol && board[1][1]==symbol && board[2][0]==symbol)
			return true;
		for(int i=0;i<board.length;i++) {
			if(board[i][0]==symbol && board[i][1]==symbol && board[i][2]==symbol)
				return true;
		}
		for(int j=0;j<board[0].length;j++) {
			if(board[0][j]==symbol && board[1][j]==symbol && board[2][j]==symbol)
				return true;
		}
		return false;
	}
	
	
	public boolean checkInput(int row,int col) {
		char[][] board = boardObj.getBoard();
		if(row>=board.length || col>=board[0].length)
			return false;
		if(board[row][col]==' ')
			return true;
		return false;
	}
	
	public boolean isDraw() {
		boolean check =true;
		char[][] board = boardObj.getBoard();
		for(char[] row : board) {
			for(char ch:row) {
				if(ch ==' ') {
					check=false;
				}
			}
		}
		return check;
	}
	
	
	

}
