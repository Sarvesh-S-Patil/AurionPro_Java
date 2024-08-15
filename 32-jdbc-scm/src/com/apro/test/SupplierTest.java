package com.apro.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.apro.model.SupplierController;

public class SupplierTest {
	public static void main(String[] args) {
		SupplierController supplierController = new SupplierController();
		supplierController.addSupplier();
		 ResultSet res1= supplierController.getSupplier(1);
		 ResultSet res2 = supplierController.getSupplier(2);
		 try {
			while(res1.next()) {
				 System.out.println(res1.getInt(1));
			 }
			System.out.println(res2.getFetchSize());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
