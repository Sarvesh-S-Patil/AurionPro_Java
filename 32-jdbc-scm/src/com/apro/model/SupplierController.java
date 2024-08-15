package com.apro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SupplierController {
	Connection connection = DBConnection.getConnection();

	public void addSupplier() {
		Connection connection = DBConnection.getConnection();
		String query = "insert into suppliers values(?,?,?,?)";
		try {
			Scanner scanner = new Scanner(System.in);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter Supplier Id : ");
			int supplierId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name : ");
			String name = scanner.nextLine();
			System.out.println("Enter Contact info (@Email) : ");
			String email = scanner.nextLine();
			System.out.println("Enter Address : ");
			String address = scanner.nextLine();
			preparedStatement.setInt(1,supplierId);
			preparedStatement.setString(2,name);
			preparedStatement.setString(3,email );
			preparedStatement.setString(4,address );
			
			preparedStatement.executeUpdate();
			System.out.println("Supplier Added Successfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
	public ResultSet getSupplier(int supplierId) {
		Connection connection = DBConnection.getConnection();
		String query = "select * from suppliers where supplierid = ? ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, supplierId);
			ResultSet result = preparedStatement.executeQuery();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
		
	
	
	public void getAllProducts() {
		Connection connection = DBConnection.getConnection();
		String query = "select * from suppliers";
		try {
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(query);
			printResultState(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void printResultState(ResultSet rs) throws SQLException { 
		  ResultSetMetaData metadata = rs.getMetaData(); 
		  int columnCount = metadata.getColumnCount(); 
		  for (int i = 1; i <= columnCount; i++) { 
		   System.out.print(metadata.getColumnName(i) + ", "); 
		  } 
		  System.out.println(); 
		  while (rs.next()) { 
		   String row = ""; 
		   for (int i = 1; i <= columnCount; i++) { 
		    row += rs.getString(i) + ", "; 
		   } 
		   System.out.println(); 
		   System.out.println(row); 
		 
		  } 
	}
	
	
	public void deleteSupplierById(int supplierId) {
		Connection connection = DBConnection.getConnection();
		String query = "DELETE FROM suppliers WHERE supplierid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, supplierId);
			ResultSet result = preparedStatement.executeQuery(query);
			printResultState(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
