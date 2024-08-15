package com.apro.test;

import java.util.Scanner;

import com.apro.model.InventoryController;
import com.apro.model.ProductController;
import com.apro.model.SupplierController;

public class ScmManager {
	public static void main(String[] args) {
		SupplierController supplierController= new SupplierController();
		ProductController productController = new ProductController();
		InventoryController inventoryController = new InventoryController();
		Scanner scanner = new Scanner(System.in);
//		while(true) {
//			choiceMenu();
//			int choice = scanner.nextInt();
//			switch(choice) {
//				case 1:
//					supplierController.addSupplier();
//				case 2:
//					supplierController.
//			}
//		}
		
		
		
	}
	
	
	public static void choiceMenu() {
		System.out.println("Choose your operation : ");
		System.out.println("1. Add Supplier ");
		System.out.println("2. Get All Supplier ");
		System.out.println("3. Add Product ");
		System.out.println("4. Get All Products ");
		System.out.println("5. Add inventory ");
		System.out.println("5. Get All inventory ");
		System.out.println("6. Exit");
	}

}
