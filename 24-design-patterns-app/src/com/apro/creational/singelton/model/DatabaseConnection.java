package com.apro.creational.singelton.model;

public class DatabaseConnection {
	private static  DatabaseConnection databaseConnection;
	
	private DatabaseConnection() {
		System.out.println("Database Connection created");
	}
	
	public static DatabaseConnection getDatabaseConnection() {
		if(databaseConnection==null)
			databaseConnection= new DatabaseConnection();
		return databaseConnection;
	}

}
