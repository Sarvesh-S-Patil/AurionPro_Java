package com.apro.test.temp;

import java.sql.Connection;
import java.util.List;

import com.apro.model.Customer;
import com.apro.model.CustomerUtil;
import com.apro.model.DbUtil;

public class ViewCustomerTest {
	public static void main(String[] args) {
		
		DbUtil dbUtil = new DbUtil();
		dbUtil.connectDB();
		Connection connection = dbUtil.getConnection();
		CustomerUtil customerUtil = new CustomerUtil(connection);
		List<Customer> customers = customerUtil.getCustomers();
		for(Customer  customer:customers) {
			System.out.println(customer);
		}
	}

}
