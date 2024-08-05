package com.apro.model;


public class Employee {
	private int employeeId;
	private String name;
	private int salary;

		
	public Employee(int employeeId,String name,int salary) {
		this.employeeId=employeeId;
		this.name=name;
		this.salary=salary;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		System.out.println("Details of Employee 1 :");
		System.out.println("Employee Id : "+this.getEmployeeId() + " , Name : "+this.getName() + " , Salary : "+this.getSalary());
		System.out.println("-----------------------");
		return null;
	}

	};


