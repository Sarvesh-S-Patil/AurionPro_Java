package com.apro.proxy.test;

import com.apro.proxy.model.Employee;
import com.apro.proxy.model.EmployeeList;
import com.apro.proxy.model.EmployeeListProxy;

public class ProxyEmployeeTest {
	public static void main(String[] args) {
		EmployeeList employeeList = new EmployeeList();
		EmployeeListProxy employeesProxy = new EmployeeListProxy(employeeList);
		employeesProxy.getEmployeeList("user");
		
		employeesProxy.addEmployee("user", new Employee(12, "Priya", "Goregaon"));
		employeesProxy.addEmployee("admin", new Employee(17, "Kaiwalya", "Andheri"));
		System.out.println("----------------");
		employeesProxy.getEmployeeList("user");
	}

}
