package com.apro.test.programs.SystemArgs;



public class TrapezoidArea2 {

    public static void main(String[] args) {
        
        
        double base1 = Double.parseDouble(args[0]);

        
        double base2 = Double.parseDouble(args[1]);

        
        double height = Double.parseDouble(args[2]);

        double area = (base1 + base2) / 2 * height;

        System.out.println("The area of the trapezoid is: " + area);

    }
}

