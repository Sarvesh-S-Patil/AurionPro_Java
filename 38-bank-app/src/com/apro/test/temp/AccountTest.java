package com.apro.test.temp;

import java.sql.Connection;

import com.apro.model.AccountUtil;
import com.apro.model.DbUtil;

public class AccountTest {
	public static void main(String[] args) {
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.connectDB();
		Connection connection = dbUtil.getConnection();
		AccountUtil accountUtil = new AccountUtil(connection);
		//accountUtil.addAccount(1000);
		accountUtil.deleteAccount(1234);
		accountUtil.setBalance(1000, 1147678866);
		
		System.out.println(accountUtil.getBalance(1147678866));
	}

}
