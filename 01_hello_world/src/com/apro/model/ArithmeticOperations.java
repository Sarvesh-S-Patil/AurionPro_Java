package com.apro.model;
import java.util.*;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a+ " + "+ b +" = "+ add(a,b));
		System.out.println(a+ " - "+ b +" = "+ subtract(a,b));
		System.out.println(a+ " * "+ b +" = "+ multiply(a,b));
		System.out.println(a+ " / "+ b +" = "+ divide(a,b));
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static int subtract(int a,int b) {
		return a-b;
	}
	
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	public static int divide(int a,int b) {
		return a/b;
	}
}
