package com.apro.srp.violation;

public class Invoice {
	private String id;
	private String description;
	private double amount;
	private double tax;
	
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(String id, String description, double amount, double tax) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
	}

	
	
	public double calculateTax() {
		return amount * (tax/100);
	}
	
	public void printInvoice() {
		System.out.println("Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax + ", payable tax=" + calculateTax()+ "]");
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", tax=" + tax + "]";
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	

}
