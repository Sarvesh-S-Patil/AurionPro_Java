package com.apro.transaction.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionManagementTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			Statement statement = connection.createStatement();
			System.out.println("connection Established Successfully !!");

			connection.setAutoCommit(false);

			String withdrawQuery = "update accounts set balance = balance - ? where account_number = ? ";
			String depositQuery = "update accounts set balance = balance + ? where account_number = ? ";
			PreparedStatement withdrawPS = connection.prepareStatement(withdrawQuery);
			PreparedStatement depositPS = connection.prepareStatement(depositQuery);
			
			withdrawPS.setDouble(1, 500);
			withdrawPS.setString(2, "rishikesh");

			depositPS.setDouble(1, 500);
			depositPS.setString(2, "sarvesh123");
			
			int withdrawRowsAffected = withdrawPS.executeUpdate();
			int depositRowsAffected = depositPS.executeUpdate();
			if(withdrawRowsAffected>0 && depositRowsAffected>0) {
				connection.commit();
				System.out.println("Transaction is executed successfully");
			}
			else {
				connection.rollback();
				System.out.println("Transaction Failed");
			}
			
			
			// 2 - Fail
			
			
			withdrawPS.setDouble(1, 500);
			withdrawPS.setString(2, "rishikesh");

			depositPS.setDouble(1, 500);
			depositPS.setString(2, "sarvesh");
			
			withdrawRowsAffected = withdrawPS.executeUpdate();
			depositRowsAffected = depositPS.executeUpdate();
			if(withdrawRowsAffected>0 && depositRowsAffected>0) {
				connection.commit();
				System.out.println("Transaction is executed successfully");
			}
			else {
				connection.rollback();
				System.out.println("Transaction Failed");
			}
		}
		 catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}

}
