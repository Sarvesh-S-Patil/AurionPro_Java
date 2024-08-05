package com.apro.srp.valid;

public class InvoicePrinter {
	Invoice invoice;
	TaxCalculator taxCalculator;
	
	public InvoicePrinter(Invoice invoice, TaxCalculator taxCalculator) {
		super();
		this.invoice = invoice;
		this.taxCalculator = taxCalculator;
	}
	
	public void printInvoice() {
		System.out.println("Invoice [id=" + invoice.getId() + ", description=" + invoice.getDescription() + ", amount=" + invoice.getAmount()+ ", tax=" +invoice.getTax() + ", payable tax=" + invoice.calculateTax()+ "]");
	}

}
