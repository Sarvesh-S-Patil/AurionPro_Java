package com.apro.proxy.model;

public class EmployeeListProxy {
	EmployeeList employeeList;
	
	public EmployeeListProxy(EmployeeList employeeList) {
		super();
		this.employeeList = employeeList;
	}

	public void getEmployeeList(String user) {
		if(user=="admin" || user=="user") {
			employeeList.employees.forEach((employee)->System.out.println(employee));
		}
	}
	
	public void addEmployee(String user,Employee employee) {
		if(user=="admin") {
			employeeList.addEmployee(employee);
		}
	}

}
