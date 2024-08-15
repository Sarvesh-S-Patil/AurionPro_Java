package com.apro.test.temp;

import java.sql.Connection;

import com.apro.model.AccountUtil;
import com.apro.model.AdminLogin;
import com.apro.model.AdminUtil;
import com.apro.model.DbUtil;

public class AdminTest {
	
	public static void main(String[] args) {
		
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.connectDB();
		Connection connection = dbUtil.getConnection();
		AccountUtil accountUtil = new AccountUtil(connection);
		AdminUtil adminUtil = new AdminUtil(connection);
		AdminLogin adminLogin = new  AdminLogin(connection);
		System.out.println(adminLogin.getAdminId("sarvesh@gmail.com", "12345"));
	}

}
