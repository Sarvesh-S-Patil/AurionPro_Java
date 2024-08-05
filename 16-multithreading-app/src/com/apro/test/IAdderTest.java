package com.apro.test;

import com.apro.model.IAddition;

public class IAdderTest {
	public static void main(String[] args) {
		IAddition adder = (int number1,int number2)->number1+number2;
		System.out.println(adder.add(10, 20));
	}

}
