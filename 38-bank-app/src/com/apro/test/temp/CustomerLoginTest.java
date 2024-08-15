package com.apro.test.temp;

import java.sql.Connection;

import com.apro.model.CustomerLogin;
import com.apro.model.CustomerUtil;
import com.apro.model.DbUtil;

public class CustomerLoginTest {
	public static void main(String[] args) {
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.connectDB();
		Connection connection = dbUtil.getConnection();
		CustomerLogin customerLogin = new CustomerLogin(connection);
		System.out.println(customerLogin.getCustomerId("sarvesh@gmail.com", "1234"));
	}
	

}
