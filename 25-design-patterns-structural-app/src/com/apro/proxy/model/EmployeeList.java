package com.apro.proxy.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
	static List<Employee> employees;

	public EmployeeList() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	protected List<Employee> getEmployees() {
		return employees;
	}

	protected void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	protected void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	static {
		employees= new ArrayList<Employee>();
		employees.add(new Employee(1, "Suresh", "Andheri"));
		employees.add(new Employee(2, "Ramesh", "Ghatkopar"));
		employees.add(new Employee(1, "Shruti", "Navi Mumbai"));
	}

}
