package com.apro.test.operators;

public class OpereatorsDemo {
	public static void main(String[] args) {
		int a =5;
		int b=10;
		int c = a++;
		b=c+a++;
		System.out.println(c);
		System.out.println(b);
		System.out.println((a>b)&&(c>b));
		System.out.println((a>b) || (b>c));
		System.out.println("Value of b  before : "+b+" after : "+ ++b);
	}

}
