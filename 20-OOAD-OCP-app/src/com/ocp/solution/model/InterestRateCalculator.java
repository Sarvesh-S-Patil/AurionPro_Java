package com.ocp.solution.model;
import com.ocp.solution.model.FixedDeposit;

public class InterestRateCalculator {
	FixedDeposit fixedDeposit;
	
	
	
	public InterestRateCalculator(FixedDeposit fixedDeposit) {
		super();
		this.fixedDeposit = fixedDeposit;
	}



	public double getIntrestRate() {
		return fixedDeposit.getFestival()
							.getInterestRate();
		
	}
}


