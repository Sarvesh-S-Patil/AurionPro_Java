package com.apro.srp.valid;

public class TaxCalculator {
	private Invoice invoice;
	
	
	public TaxCalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}


	public double calculateTax() {
		double taxAmount = invoice.getAmount()*(invoice.getTax()/100);
		return taxAmount;
	}

}
