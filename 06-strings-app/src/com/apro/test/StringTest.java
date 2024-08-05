package com.apro.test;

public class StringTest {
	public static void main(String[] args) {
		String name1="Devan";
		String name2="Devan";
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(name1==name2);
		String name3 =new String( "Devansh");
		String name4 =new String( "Devansh");
		System.out.println(name3.hashCode());
		System.out.println(name4.hashCode());
		System.out.println(name3.hashCode()==name4.hashCode());
		System.out.println(name3==name4);
		
		String name ="Hello";
		System.out.println(name.hashCode());
		name=name+"Bye";
		System.out.println(name.hashCode());
	}

}
