package com.apro.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductController {
	Connection connection = DBConnection.getConnection();

	public void addProduct() {
		Connection connection = DBConnection.getConnection();
		String query = "insert into products values(?,?,?,?)";
		try {
			Scanner scanner = new Scanner(System.in);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			System.out.println("Enter Product Id : ");
			int productId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Name : ");
			String name = scanner.nextLine();
			System.out.println("Enter Description : ");
			String description = scanner.nextLine();
			System.out.println("Enter Supplier Id : ");
			int supplierId = scanner.nextInt();
			scanner.nextLine();
			SupplierController supplierController = new SupplierController();
			if(supplierController.getSupplier(supplierId).next()==false) {
				System.out.println("No Supplier with id "+supplierId+" , add a new supplier :");
				supplierController.addSupplier();
			}
			preparedStatement.setInt(1,productId);
			preparedStatement.setString(2,name);
			preparedStatement.setString(3,description );
			preparedStatement.setInt(4,supplierId );
			
			preparedStatement.executeUpdate();
			System.out.println("Product Added Successfully.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
	
	public ResultSet getProduct(int productId) {
		String query = "select * from products where productId = ? ";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, productId);
			ResultSet result = preparedStatement.executeQuery();
			return result;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
//	public boolean isInventoryPresent(int inventoryId) {
//		
//	}
	
	public void getAllProducts() {
		Connection connection = DBConnection.getConnection();
		String query = "select * from products)";
		Scanner scanner = new Scanner(System.in);
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
	
	
	public void deleteProductById(int productId) {
		Connection connection = DBConnection.getConnection();
		String query = "DELETE FROM products WHERE productid=?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, productId);
			ResultSet result = preparedStatement.executeQuery(query);
			printResultState(result);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
