package com.apro.test;

import com.apro.model.DBConnection;
import com.apro.model.InventoryController;

public class InventoryTest {
	public static void main(String[] args) {
		DBConnection db = new DBConnection();
		InventoryController inventoryController = new InventoryController();
		inventoryController.addInventory();
		inventoryController.getAllInventory();
	}

}
