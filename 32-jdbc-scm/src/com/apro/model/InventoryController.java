package com.apro.model;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.apro.model.DBConnection;


public class InventoryController {
	Connection connection;
	public void addInventory() {
		String query = "insert into inventory values(?,?,?)";
		try {
			connection = DBConnection.getConnection();
			Scanner scanner = new Scanner(System.in);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter Inventory Id : ");
			int inventoryId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Product Id : ");
			int productId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Quantity avaialable : ");
			int quantityOnHand = scanner.nextInt();
			scanner.nextLine();
			ProductController productController = new ProductController();
			if(productController.getProduct(productId).next()==false) {
				System.out.println("No Product with id "+productId+" , add a new product :");
				productController.addProduct();
			}
			preparedStatement.setInt(1,inventoryId);
			preparedStatement.setInt(2,productId);
			preparedStatement.setInt(3, quantityOnHand);
			
			preparedStatement.executeUpdate();
			System.out.println("Inventory Added Successfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
		public void updateProductId() {
			connection = DBConnection.getConnection();
			String query = "update inventory set productId = ? where inventoryId= ? ";
			try {
				Scanner scanner = new Scanner(System.in);
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				System.out.println("Enter Update Product Id : ");
				int productId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Inventory Id : ");
				int inventoryId = scanner.nextInt();
				scanner.nextLine();

				preparedStatement.setInt(1,productId);
				preparedStatement.setInt(2,inventoryId);
				
				
				preparedStatement.execute();
				System.out.println("Inventory Updated Successfully.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		
		
	public void getAllInventory() {
		String query = "select * from inventory";
		try {
			connection = DBConnection.getConnection();
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

		
		

}
