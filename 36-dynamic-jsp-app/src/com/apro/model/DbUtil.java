package com.apro.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	private Statement statement;
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet allUsers;
	
	
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
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
	
	public void getAllUsers() {
		String query = "select * from users";
		ResultSet result=null;
		try {
			result = statement.executeQuery(query);
			allUsers=result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean isUserPresent(String username,String password) {
		try {
			while(allUsers.next()) {
				if(allUsers.getString("username").equals(username) && allUsers.getString("password").equals(password))
					return true;
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	


}
