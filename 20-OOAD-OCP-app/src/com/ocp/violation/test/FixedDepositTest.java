package com.ocp.violation.test;

import com.ocp.violation.model.*;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit depositAccount = new FixedDeposit(10, "Ramesh", 2000, 2,FestivalType.NEWYEAR);
		double simpleInterest =depositAccount.calculateSimpleIntrest();
		System.out.println(simpleInterest);
	}

}
