package com.dip.solution.model;

public class TaxCalculator {
	
	FIleLogger fileLogger;
	DBLogger dbLogger;
	
	
	



	public TaxCalculator(FIleLogger fileLogger, DBLogger dbLogger) {
		super();
		this.fileLogger = fileLogger;
		this.dbLogger = dbLogger;
	}






	public int calculateTax(int amount,int rate) {
		int tax =0;
		try {
			tax = amount/rate;
		}
		catch(Exception exception) {
				fileLogger.error("Divide by zero");
				dbLogger.error("Divide by zero");
		}
		return tax;
	}
	

}
