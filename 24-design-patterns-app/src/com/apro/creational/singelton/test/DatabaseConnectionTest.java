package com.apro.creational.singelton.test;

import com.apro.creational.singelton.model.DatabaseConnection;

public class DatabaseConnectionTest {
	public static void main(String[] args) {
		DatabaseConnection db = DatabaseConnection.getDatabaseConnection();
		System.out.println(db.hashCode());
		DatabaseConnection db2 = DatabaseConnection.getDatabaseConnection();
		System.out.println(db2.hashCode());
	}

}
