package com.apro.iterator.test;

import java.util.ArrayList;
import java.util.Arrays;

import com.apro.iterator.model.MyIterator;
import com.apro.iterator.model.User;
import com.apro.iterator.model.UserManagement;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList<User> userList = new ArrayList<User>();
		userList.add(new User("Ramesh"));
		userList.add(new User("Suresh"));
		UserManagement userManager = new UserManagement(userList);
		MyIterator iterator = userManager.getIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
