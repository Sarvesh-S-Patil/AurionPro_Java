package com.ocp.solution.model;
import com.ocp.solution.model.FixedDeposit;

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
