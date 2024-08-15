package com.apro.test.temp;

import java.sql.Connection;
import java.util.List;

import com.apro.model.Account;
import com.apro.model.CustomerUtil;
import com.apro.model.DbUtil;

public class CustomerTest {
	public static void main(String[] args) {
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.connectDB();
		Connection connection = dbUtil.getConnection();
		CustomerUtil customerUtil= new CustomerUtil(connection);
		//customerUtil.addCustomer("Jack", "Ryan","jack@gmail.com", "jack", 1);
		
//		List<Account> accounts = customerUtil.getCustomerAccounts(2);
// 		for(Account account : accounts) {
// 			System.out.println(account);
// 		}
 		
 		boolean row_affected = customerUtil.updateCustomer("pratik", "kuhad", "1234", 7);
 		System.out.println(row_affected);
	}

}
