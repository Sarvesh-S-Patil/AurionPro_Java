package com.apro.test;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> evenPredicate = (Integer number) -> (number%2==0);
		System.out.println(evenPredicate.test(4));
		BiPredicate<Integer,Integer> greaterNoPredicate = (Integer number1,Integer number2) -> number1>number2;
		System.out.println(greaterNoPredicate.test(4, 5));
	}

}
