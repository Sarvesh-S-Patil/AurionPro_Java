package com.apro.adapter.model;

public class Hat {
	private double basicPrice;
	private double tax;
	private String shortName;
	private String longName;
	public Hat(double basicPrice, double tax, String shortName, String longName) {
		super();
		this.basicPrice = basicPrice;
		this.tax = tax;
		this.shortName = shortName;
		this.longName = longName;
	}
	public double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	
	

}
