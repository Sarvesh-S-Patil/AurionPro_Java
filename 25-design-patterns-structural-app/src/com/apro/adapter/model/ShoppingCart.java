package com.apro.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	List<IItem> itemList;

	public ShoppingCart() {
		this.itemList = new ArrayList<IItem>();
	}

	public ShoppingCart(List<IItem> itemList) {
		super();
		this.itemList = itemList;
	}

	public List<IItem> getItemList() {
		return itemList;
	}

	public void addItem(IItem item) {
				itemList.add(item);
	}
	
	public void displayItems() {
		itemList.forEach((item)->System.out.println(item.getName() +" | " +item.getPrice()));
	}
	
	public double getTotalPrice() {
		return itemList
				.stream()
				.mapToDouble((item)->item.getPrice())
				.reduce(0,(price1,price2)->price1+price2); 
	}

	public void addItemList(List<IItem> item) {
		// TODO Auto-generated method stub
		itemList.addAll(item);
		
	}

}
