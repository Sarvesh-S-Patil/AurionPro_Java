package com.ocp.violation.model;

public class SimpleInterestCalculator {
	FixedDeposit fixedDeposit;
	
	public SimpleInterestCalculator(FixedDeposit fixedDeposit) {
		super();
		this.fixedDeposit = fixedDeposit;
	}

	public double calculateSimpleIntrest() {
		return  ( fixedDeposit.getPrincipalAmount()*fixedDeposit.getDuration()* fixedDeposit.getIntrestRate() )/100;
	}

}
