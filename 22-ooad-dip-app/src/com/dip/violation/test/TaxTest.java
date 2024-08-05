package com.dip.violation.test;

import com.dip.violation.model.DBLogger;
import com.dip.violation.model.TaxCalculator;

public class TaxTest {
	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(new DBLogger());
		taxCalculator.taxCalculator(1000, 0);
	}

}
