package com.apro.test.programs.SystemArgs;



public class CompoundInterest2 {

    public static void main(String[] args) {

        
        double principal = Double.parseDouble(args[0]);
//        System.out.print("Enter the annual interest rate (in percentage): ");
        double rateOfInterest = Double.parseDouble(args[1]);

//        System.out.print("Enter the time period in years: ");
        double timeInYears = Double.parseDouble(args[2]);

        rateOfInterest = rateOfInterest / 100;


        double amount = principal * Math.pow(1 + rateOfInterest, timeInYears);
        double compoundInterest = amount - principal;

        System.out.printf("Compound Interest after %.2f years: %.2f\n", timeInYears, compoundInterest);

    }
}

