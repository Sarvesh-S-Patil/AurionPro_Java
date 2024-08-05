package com.apro.test;

import com.apro.model.Demo;

public class DemoTest {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		d1.increment();
		d2.increment();
		d3.increment();
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
	}
	
	static {
		System.out.println("Hello");
	}

}
