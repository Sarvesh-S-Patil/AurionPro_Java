package com.apro.model;

public class Board {
	
	private char[][] board ;
	
	

	public Board(char[][] board) {
		super();
		this.board = board;
	}

	public char[][] getBoard() {
		return board;
	}

	
	
	public void setBoard(char[][] board) {
		this.board = board;
	}

	public void printBoard(){
		for(char[] row : board) {
			for(int i=0;i<row.length;i++) {
				if(i==row.length-1) {
					System.out.print(row[i]);
					continue;
				}
				System.out.print(row[i] + " | ");
				
			}
			System.out.println();	
		}
	}

	

}
