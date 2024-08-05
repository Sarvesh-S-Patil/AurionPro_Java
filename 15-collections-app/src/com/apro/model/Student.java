package com.apro.model;

public class Student {
	private  int RollNumber;
	private String name;
	private int percentage;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String name, int percentage) {
		super();
		RollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}


}
