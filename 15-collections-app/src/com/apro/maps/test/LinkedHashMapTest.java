package com.apro.maps.test;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		hm.put(5,"Chirag");
		hm.put(4,"Shirish");
		hm.put(7,"Vinayak");
		System.out.println(hm);
	}

}
