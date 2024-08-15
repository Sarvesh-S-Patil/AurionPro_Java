package com.apro.test;

import java.util.Scanner;

import com.apro.model.DbConnection;

public class DBConnectionTest {
	public static void main(String[] args) {
		
		DbConnection connection = new DbConnection();
		connection.connectDB();
		System.out.println("Department Data : ");
		connection.getDeptData();
		
		connection.addDept();
		connection.getDeptData();
		
		
	}

}
