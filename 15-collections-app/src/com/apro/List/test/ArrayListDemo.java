package com.apro.List.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Jack");
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+ " , ");
		}
		System.out.println();
		for(String element : list) {
			System.out.print(element+" , ");
		}
		System.out.println();
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+ " , ");
		}
		System.out.println();
		
		ListIterator listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next()+ " , ");
		}
		System.out.println();
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous()+ " , ");
		}
		
	}
}
