package com.apro.adapter.test;


import java.util.Arrays;

import com.apro.adapter.model.Biscuit;
import com.apro.adapter.model.Choclate;
import com.apro.adapter.model.Hat;
import com.apro.adapter.model.HatAdapter;
import com.apro.adapter.model.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		HatAdapter hat = new HatAdapter( new Hat(100,10, "sports hat", "Baseball Cap"));
		HatAdapter hat1 =new HatAdapter( new Hat(200, 20, "hat", "straw hat"));
		Choclate choclate = new Choclate("Snickers", 50);
		Biscuit biscuit = new Biscuit("NutriChoice", 20);
		ShoppingCart cart = new ShoppingCart();
		cart.addItemList(Arrays.asList(hat,hat1,choclate,biscuit));
		cart.displayItems();
		
		System.out.println("Total Bill is : "+cart.getTotalPrice());
		
	}

}
