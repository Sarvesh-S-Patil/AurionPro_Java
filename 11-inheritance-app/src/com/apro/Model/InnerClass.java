package com.apro.Model;

public class InnerClass {
	
	public void show() {
		System.out.println("I am in the outer class");
	}
	public class inner{
		
		public void show() {
			System.out.println("I am in the inner class");
		}
	}

}
