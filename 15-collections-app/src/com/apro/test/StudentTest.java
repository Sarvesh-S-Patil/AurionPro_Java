package com.apro.test;
import java.util.ArrayList;
import java.util.Collections;

import com.apro.model.Student;
import com.apro.model.StudentComparator;


public class StudentTest {
	
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Pranay", 80));
		students.add(new Student(3,"Aditi", 80));
		students.add(new Student(2,"Shivam", 90));
		
		for(Student student: students) {
			System.out.println(student);
		}
		
		Collections.sort(students,new StudentComparator.StudentNameComparator());
		System.out.println("-------------Sorted Order By Roll Number------------------");
		for(Student student: students) {
			System.out.println(student);
		}
		
		Collections.sort(students, new StudentComparator.StudentNameComparator());
		System.out.println("-------------Sorted Order By Name ------------------");
		for(Student student: students) {
			System.out.println(student);
		}
		
		Collections.sort(students, new StudentComparator.StudentPercentageComparator());
		System.out.println("-------------Sorted Order By Percentage------------------");
		for(Student student: students) {
			System.out.println(student);
		}
	}

}
