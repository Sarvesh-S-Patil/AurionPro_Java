package com.ocp.violation.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principalAmount;
	private int duration;
	private FestivalType festival;
	
	public double getIntrestRate() {
		InterestRateCalculator interestCalculator = new InterestRateCalculator(this);
		return interestCalculator.getIntrestRate();
	}
	
	public double calculateSimpleIntrest() {
		SimpleInterestCalculator interestCalculator = new SimpleInterestCalculator(this);
		return  interestCalculator.calculateSimpleIntrest();
	}
	
	public FixedDeposit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FixedDeposit(int accountNumber, String name, double principalAmount, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.festival = festival;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrincipalAmount() {
		return principalAmount;
	}


	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public FestivalType getFestival() {
		return festival;
	}


	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}
	
	
	
	

}
