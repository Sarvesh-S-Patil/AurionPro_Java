package com.apro.test.temp;

import java.sql.Connection;

import com.apro.model.DbUtil;
import com.apro.model.TransactionUtil;

public class TransactionTest {
	
	public static void main(String[] args) {
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.connectDB();
		Connection connection=dbUtil.getConnection();
		TransactionUtil transactionUtil = new TransactionUtil(connection);
		System.out.println(transactionUtil.addTransaction(5632133342L,1135947882L, "Transfer", 500));
		System.out.println("I am here");
	}

}
