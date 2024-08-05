package com.apro.maps.test;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(5,"Chirag");
		hm.put(4,"Shirish");
		hm.put(7,"Vinayak");
		System.out.println(hm);
		Set<Entry<Integer,String>> entries= hm.entrySet();
		
		for(Entry entry:entries) {
			System.out.println(entry.getKey()+ " = "+entry.getValue());
		}
		Set<Integer> keys = hm.keySet();
		for(int key:keys) {
			String value = hm.get(key);
			System.out.println(key+" = "+value);
		}
	}

}
