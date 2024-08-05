package com.apro.List.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.apro.List.Student;

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of students : ");
		int studentCount = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<studentCount;i++) {
			students.add(createNewStudent(scanner));
			System.out.println("Student created successfully");
		}
		for(Student student : students) {
			System.out.println(student);
			
		}
	}
	
	public static Student createNewStudent(Scanner scanner) {
		System.out.println("Enter Student Roll Number :");
		int rollNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter Student Name :");
		String name = scanner.nextLine();
		System.out.println("Enter Student Percentage :");
		int percentage = scanner.nextInt();
		scanner.nextLine();
		Student student = new Student(rollNo, name, percentage);
		return student;
	}

}
