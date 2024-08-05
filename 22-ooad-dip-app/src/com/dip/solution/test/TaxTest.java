package com.dip.solution.test;

import com.dip.solution.model.DBLogger;

import com.dip.solution.model.FIleLogger;
import com.dip.solution.model.TaxCalculator;

public class TaxTest {
	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(new FIleLogger(),new DBLogger());
		taxCalculator.calculateTax(1000, 0);
		
		Integer a =1;
		Integer b=128;
		int c=1;
		int d=1;
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(c==d);
	}

}
