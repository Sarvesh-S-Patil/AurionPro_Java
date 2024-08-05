package com.apro.List.test;

import java.util.LinkedList;

public class LinkedLIstTest {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Sarvesh");
		list.add("Chirag");
		list.add("Sayali");
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeFirst());
		System.out.println(list.getFirst());
	}

}
