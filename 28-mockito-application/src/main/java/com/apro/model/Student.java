package com.apro.model;

public class Student {
	private IStudentService studentService;
	
	public Student(IStudentService studentService) {
		super();
		this.studentService = studentService;
	}

	public double calculatPercentage() {
		return (studentService.getMarks()/studentService.getNoSubjects());
	}

}
