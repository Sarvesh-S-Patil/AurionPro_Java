package com.apro.model;

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	double average;
	
	public void display() {
		System.out.println("Details of player are - ");
		System.out.println("Player ID : " + this.playerId);
		System.out.println("Player Name : " + this.name);
		System.out.println("Number of Matches : " + this.numberOfMatches);
		System.out.println("Runs : " +this.runs);
		System.out.println("Number of Wickets  : " + this.numberOfWickets);
	}
	
	public double calculateAverage() {
		double average = runs/numberOfMatches;
		return average;
	}
	

	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.numberOfWickets = numberOfWickets;
		this.calculateAverage();
	}

	public int getPlayerId() {
		return this.playerId;
	}
	public String getName() {
		return this.name;
	}
	public int numberOfMatches() {
		return this.numberOfMatches;
	}
	public int getRuns() {
		return this.runs;
	}
	public int getNumberOfWickets() {
		return this.numberOfWickets;
	}
	
	public void setPlayerId(int playerId) {
		this.playerId=playerId;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches=numberOfMatches;
	}
	public void setRuns(int runs) {
		this.runs= runs;
	}
	public void numberOfWickets(int numberOfWickets) {
		this.numberOfWickets=numberOfWickets;
	}

}
