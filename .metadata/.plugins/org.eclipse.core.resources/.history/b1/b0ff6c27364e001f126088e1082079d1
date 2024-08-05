package com.ocp.violation.model;

public class InterestRateCalculator {
	FixedDeposit fixedDeposit;
	
	
	
	public InterestRateCalculator(FixedDeposit fixedDeposit) {
		super();
		this.fixedDeposit = fixedDeposit;
	}



	public double getIntrestRate() {
		switch(fixedDeposit.getFestival()) {
		case DIWALI:
			return 8.5;
		case HOLI:
			return 7.5;
		case NEWYEAR:
			return 8;
		case OTHERS:		
		default:
			return 6.5;
		
		}
	}

}
