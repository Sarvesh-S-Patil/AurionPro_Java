package com.apro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {
	private Statement statement;
	private Connection connection;
	private PreparedStatement preparedStatement;
	
	
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/organization","root","root");
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
	
	
	public void getDeptData() {
		ResultSet dbDeptData;
		try {
			dbDeptData = statement.executeQuery("select * from dept");
			while(dbDeptData.next()) {
				System.out.println(dbDeptData.getInt("deptNo") + "\t" + dbDeptData.getString("deptName") + "\t"+dbDeptData.getString("deptloc"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addDept() {
		try {
			this.preparedStatement= connection.prepareStatement("insert into dept values (?,?,?)");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Department Number : ");
			int deptNo=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Department Name : ");
			String deptName= scanner.nextLine();
			System.out.println("Enter Department Location : ");
			String deptLoc = scanner.nextLine();
			
			preparedStatement.setInt(1,deptNo);
			preparedStatement.setString(2, deptName);
			preparedStatement.setString(3, deptLoc);
			preparedStatement.executeUpdate();
			System.out.println("Department added successfully ! ");
//			statement.executeUpdate("Insert into dept values ("+deptNo+","+deptName+","+deptLoc+")" );
//			System.out.println("Department Added Successfully");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void updateDept() {
		
	}

}
