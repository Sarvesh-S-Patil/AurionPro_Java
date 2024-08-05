package com.apro.test;

import java.util.Scanner;


import com.apro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of employees : ");
		int no_of_employees = scanner.nextInt();
		Employee[] employees= new Employee[no_of_employees]; 
		for(int i=0;i<employees.length;i++) {
			System.out.println("Enter Details of employee : ");
			System.out.println("Enter Employee ID : ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter name : ");
			String name = scanner.nextLine();
			System.out.println("Enter salary :");
			int salary = scanner.nextInt();
			employees[i] = new Employee(id,name,salary);
			System.out.println("-----------------------");
		}
		for(int i=0;i<employees.length;i++) {
			employees[i].toString();
		}
	}

}
