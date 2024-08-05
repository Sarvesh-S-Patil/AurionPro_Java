package com.apro.iterator.model;

import java.util.ArrayList;


public class MyIteratorImplementation  implements MyIterator{
	private ArrayList<User> userList;
	private int length;
	private int position=0;



	public MyIteratorImplementation(ArrayList<User> userList) {
		super();
		this.userList = userList;
		length = userList.size();
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(userList==null)
			return false;
		if(position>=length)
			return false;
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		User user = userList.get(position);
		position+=1;
		return user;
	}

}
