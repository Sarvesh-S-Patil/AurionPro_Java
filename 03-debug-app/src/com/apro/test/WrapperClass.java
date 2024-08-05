package com.apro.test;

public class WrapperClass {
	public static void main(String[] args) {
		int a =10;
		//Auto boxing 
		Integer aObj = a;
		System.out.println(aObj);
		
		//Auto unboxing
		Integer bObj =20;
		int b = bObj;
		System.out.println(b);
	}

}
