package com.apro.test.programs.Scanner;

import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter the annual interest rate (in percentage): ");
        double rateOfInterest = scanner.nextDouble();

        System.out.print("Enter the time period in years: ");
        double timeInYears = scanner.nextDouble();

        rateOfInterest = rateOfInterest / 100;


        double amount = principal * Math.pow(1 + rateOfInterest, timeInYears);
        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest after %.2f years: %.2f\n", timeInYears, compoundInterest);

    }
}

