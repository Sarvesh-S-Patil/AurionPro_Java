package com.apro.iterator.model;

import java.util.ArrayList;



public class UserManagement {
	
	ArrayList<User> userList;

	public UserManagement(ArrayList<User> userList) {
		super();
		this.userList = userList;
	}
	
	public void addUser(User user) {
		userList.add(user);
	}
	
	public User getUser(int index) {
		return userList.get(index);
	}
	
	public MyIterator getIterator() {
		return  new MyIteratorImplementation(userList);
	}

}
