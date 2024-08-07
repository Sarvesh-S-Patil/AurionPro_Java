package com.apro.model;

import javax.print.attribute.standard.RequestingUserName;

public class Game {
	private Player[] players;
	private Player currentPLayer;
	private Board board;
	private ResultAnalyzer analyzer;
	private ResultType result = ResultType.PROGRESS;
	

	public Game(Player[] players, Player currentPLayer, ResultType result) {
		super();
		this.players = players;
		this.currentPLayer = currentPLayer;
		this.analyzer = new ResultAnalyzer();
		this.board= analyzer.getBoard();
		this.result = result;
	}

	public void play(int loc) {
		board.setCellMark(loc, currentPLayer.getMark());
		switchCurrentPlayer();
		board.printBoard();
	}
	
	public void switchCurrentPlayer() {
		if(currentPLayer==players[0]) {
			currentPLayer=players[1];
			return;
		}
		currentPLayer=players[0];
	}
	
	public ResultType analyzeResult() {
		if(analyzer.horizontalWinCheck() || analyzer.verticalWinCheck() || analyzer.diagonalWinCheck()) {
			result = ResultType.WIN;
			return ResultType.WIN;
		}
			
		for(Cell cell : board.getCells()) {
			if(cell.isEmpty())
				result=ResultType.PROGRESS;
				return ResultType.PROGRESS;
		}
		
		return ResultType.DRAW;
		
	}


	public Player[] getPlayers() {
		return players;
	}


	public void setPlayers(Player[] players) {
		this.players = players;
	}


	public Player getCurrentPLayer() {
		return currentPLayer;
	}


	public void setCurrentPLayer(Player currentPLayer) {
		this.currentPLayer = currentPLayer;
	}


	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}


	public ResultAnalyzer getAnalyzer() {
		return analyzer;
	}


	public void setAnalyzer(ResultAnalyzer analyzer) {
		this.analyzer = analyzer;
	}


	public ResultType getResult() {
		return result;
	}


	public void setResult(ResultType result) {
		this.result = result;
	}

	
	
	
	
	

}
