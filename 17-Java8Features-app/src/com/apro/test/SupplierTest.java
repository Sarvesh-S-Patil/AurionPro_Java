package com.apro.test;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {
		Supplier<Integer> randomNoSupplier = () -> (int) (Math.random()*1000);
		System.out.println(randomNoSupplier.get());
	}

}
