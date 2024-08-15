package com.apro.test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataTest {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm","root","root");
			DatabaseMetaData databaseMetaData = connection.getMetaData();
            ResultSet tables = databaseMetaData.getTables(null, null, "%", new String[] {"TABLE"});
            while (tables.next()) {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println("Table: " + tableName);
                
                }
              
//                Statement statement = connection.createStatement();
//                ResultSet rs = statement.executeQuery("select * from "+tableName);
//                ResultSetMetaData rsMetaData = rs.getMetaData();
//                System.out.println("List of column names in the current table: ");
//                //Retrieving the list of column names
//                int count = rsMetaData.getColumnCount();
//                for(int i = 1; i<=count; i++) {
//                	System.out.print(rsMetaData.getColumnName(i)+ " , " );
//                }
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
