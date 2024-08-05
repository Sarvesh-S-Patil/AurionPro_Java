package com.dip.violation.model;

public class TaxCalculator {
	
	DBLogger dbLogger;

	public TaxCalculator(DBLogger dbLogger) {
		super();
		this.dbLogger = dbLogger;
	}
	
	public int taxCalculator(int amount,int rate) {
		int tax =0;
		try {
			tax = amount/rate;
		}
		catch(Exception exception) {
			DBLogger.error("Divide by zero error");
		}
		return tax;
	}
	

}
