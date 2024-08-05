package com.ocp.solution.test;

import com.ocp.solution.model.FixedDeposit;
import com.ocp.solution.model.IFestivalDiwali;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(10,"Ram", 1000, 2, new IFestivalDiwali());
		System.out.println("Interest for diwali is "+fixedDeposit.calculateSimpleIntrest());
	}

}
