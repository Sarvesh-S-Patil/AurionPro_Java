package com.apro.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.apro.model.Employee;
import com.apro.model.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1,"Ram", 10000));
		employees.add(new Employee(10,"Hari", 30000));
		employees.add(new Employee(2,"Shyam",22000));
		employees.add(new Employee(1,"Bosco", 150000));
		
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		System.out.println("---------Sorted Order by ID-----------");
		Collections.sort(employees, new EmployeeComparator.EmployeeIdComparator());
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		System.out.println("---------Sorted Order by name-----------");
		Collections.sort(employees, new EmployeeComparator.EmployeeNameComparator());
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		
		System.out.println("---------Sorted Order by Salary-----------");
		Collections.sort(employees, new EmployeeComparator.EmployeeSalaryComparator());
		for(Employee employee:employees) {
			System.out.println(employee);
		}
	}

}
