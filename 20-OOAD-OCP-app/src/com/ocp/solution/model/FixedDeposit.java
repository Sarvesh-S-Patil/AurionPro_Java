package com.ocp.solution.model;

import com.ocp.solution.model.InterestRateCalculator;
import com.ocp.solution.model.SimpleInterestCalculator;;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principalAmount;
	private int duration;
	private IFestivalInterest festival;
	
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

	public FixedDeposit(int accountNumber, String name, double principalAmount, int duration,
			IFestivalInterest festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principalAmount = principalAmount;
		this.duration = duration;
		this.festival = festival;
	}

	public IFestivalInterest getFestival() {
		return festival;
	}

	public void setFestival(IFestivalInterest festival) {
		this.festival = festival;
	}
	
	


	
	
	
	
	

}
