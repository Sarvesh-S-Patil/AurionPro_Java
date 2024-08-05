package com.apro.model;

public class Player {
	private String playerName;
	private char symbol;
	
	public Player(String playerName, char symbol) {
		super();
		this.playerName = playerName;
		this.symbol = symbol;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
	public Player createPlayer(Player player) {
		return player;
	}

}
