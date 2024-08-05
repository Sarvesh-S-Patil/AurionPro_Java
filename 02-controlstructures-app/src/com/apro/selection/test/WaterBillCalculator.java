package com.apro.selection.test;
import java.util.Scanner;

public class WaterBillCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of units consumed : ");
		int units = scanner.nextInt();
		int charge=0;
		int meter_charge=75;
		if(units<=100) {
			charge=units*5;
		}
		else {
			if(units<=250) {
				charge = 100*5;
				charge += (units-100)*10;
			}
			else {
				charge = 100*5;
				charge +=150*10;
				charge +=(units-250)*20;
			}
		}
		int total_bill=charge+meter_charge;
		System.out.println("Total Water Bill is : "+total_bill);
	}
}
