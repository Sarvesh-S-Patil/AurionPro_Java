package com.apro.test;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Chirag");
		System.out.println(name.hashCode());
		System.out.println(name);
		name.append(" AurionPro");
		System.out.println(name.hashCode());
		System.out.println(name);
	}

}
