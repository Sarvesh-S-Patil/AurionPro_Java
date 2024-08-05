package com.apro.srp.vioalation.test;
import com.apro.srp.violation.Invoice;
public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("2","Savings account", 20000, 2);
		double payableTax = invoice.calculateTax();
		System.out.println("Payable Tax is : "+payableTax);
		invoice.printInvoice();
		
	}

}
