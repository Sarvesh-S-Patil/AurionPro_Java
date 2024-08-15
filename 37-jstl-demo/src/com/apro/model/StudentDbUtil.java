package com.apro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDbUtil {
	private Statement statement;
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
			this.statement = connection.createStatement();
			
			
			System.out.println("Connection Successful");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Student> getAllStudents() {
		String query = "select * from students";
		List<Student> students= new ArrayList<>();
		ResultSet result=null;
		try {
			ResultSet allStudents = statement.executeQuery(query);
			while(allStudents.next()) {
				students.add(new Student(allStudents.getInt("rollno"),allStudents.getString("name"), allStudents.getDouble("percentage")));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	}

}
