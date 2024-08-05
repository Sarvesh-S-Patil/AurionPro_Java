package com.apro.test;

public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("Shyam");
		System.out.println(name);
		System.out.println(name.hashCode());
		name = name.append(" Das");
		System.out.println(name);
		System.out.println(name.hashCode());
	}
}
