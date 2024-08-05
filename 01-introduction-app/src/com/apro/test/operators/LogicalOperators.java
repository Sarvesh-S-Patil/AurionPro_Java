package com.apro.test.operators;

public class LogicalOperators{
    public static void main(String[] args) {
        int a = 10, b = 20, c = 20;

        // Logical AND (&&)
        if ((a < b) && (b == c)) {
            int d = a + b + c;
            System.out.println("The sum is: " + d);
        } else {
            System.out.println("False conditions");
        }

        // Logical OR (||)
        a = 10;
        b = 20;
        c = 15;
        if ((a > c) || (b > c)) {
            System.out.println("Valid conditions");
        }
        System.out.println("False Conditions");

        // Logical NOT (!)
        boolean result = !(a < b);
        System.out.println("Is a greater than b " + result);
    }
}


