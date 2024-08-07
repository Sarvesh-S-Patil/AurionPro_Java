package com.apro.model;

public class Player {
	private MarkType mark;
	private String playerName;
	
	public Player(MarkType mark, String playerName) {
		super();
		this.mark = mark;
		this.playerName = playerName;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		this.mark = mark;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + "]";
	}
	
	
	
	
	

}
