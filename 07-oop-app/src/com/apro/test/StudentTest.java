package com.apro.test;

import java.util.Scanner;

import com.apro.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student1 = new Student();
		System.out.println("Enter details of student 1 - ");
		System.out.println("Enter roll number : ");
		int rollNumber = sc.nextInt();
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter Percentage : ");
		double percentage = sc.nextDouble();
		student1.setRollNumber(rollNumber);
		student1.setName(name);
		student1.setAge(age);
		student1.setPercentage(percentage);
		
		System.out.println("Details of student1 are : ");
		System.out.println("Roll Number : "+student1.getRollNumber()+" Name : "+student1.getName()+ " Age : "+student1.getAge()+ " Percentage : "+student1.getPercentage());
		
		Student student2= new Student();
		System.out.println("Enter details of student 2 - ");
		System.out.print("Enter roll number : ");
		rollNumber = sc.nextInt();
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter age : ");
		age = sc.nextInt();
		System.out.println("Enter Percentage : ");
		percentage = sc.nextDouble();
		student2.setRollNumber(rollNumber);
		student2.setName(name);
		student2.setAge(age);
		student2.setPercentage(percentage);
		
		System.out.print("Details of student1 are : ");
		System.out.println("Roll Number : "+student2.getRollNumber()+" Name : "+student2.getName()+ " Age : "+student2.getAge()+ " Percentage : "+student2.getPercentage());
		
	
	}

}
