package com.apro.test;

import com.apro.model.IFactorial;

public class IFactorialTest {
	public static void main(String[] args) {
		IFactorial factorialCalculator = (int number)-> {
			int result =1;
			for(int i=number;i>1;i--) {
				result= result*number;
				number =number-1;
			}
			
			return result;
		};
	
		System.out.println(factorialCalculator.factorial(5));
	}

}
