package com.apro.batch.processing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchProcessingTest {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement statement = connection.createStatement();
			System.out.println("connection Established Successfully !!");

			connection.setAutoCommit(false);

			String query = "INSERT INTO employees (name, job_title, salary) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement (query);

			Scanner scanner = new Scanner(System.in);

			while(true) {
				System.out.print("Name: ");
				String name = scanner.nextLine();
				System.out.print("Job Title: ");
				String job_title = scanner.nextLine();
				System.out.print("Salary: ");
				double salary = scanner.nextDouble();
				scanner.nextLine();
				preparedStatement.setString(1, name); 
				preparedStatement.setString(2, job_title);
				preparedStatement.setDouble(3, salary);
				preparedStatement.addBatch();
				System.out.println("Add more values Y/N");
				String decision=scanner.nextLine();
				if(decision.toUpperCase().equals("N")) {
					break;
				}
			}
			int[] result = preparedStatement.executeBatch();
			connection.commit();
			System.out.println("Batch Executed Successfully");

			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
