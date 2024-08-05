package com.apro.selection.test.assignment;

import java.util.Scanner;

public class CurrencyDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        
        int amount = scanner.nextInt();
        if (amount > 50000) {
            System.out.println("Amount exceeds withdrawal limit of 50000");
            return;
        }
        else if (amount % 100 != 0) {
            System.out.println("Input amount should be a multiple of 100");
            return;
        }
        
        int remainingAmount = amount;
        int twoThousandCount = remainingAmount / 2000;
        remainingAmount = remainingAmount%2000;
        if (twoThousandCount > 0) {
            System.out.println("Two Thousand: " + twoThousandCount);
        }

        int fiveHundredCount = remainingAmount / 500;
        remainingAmount = remainingAmount % 500;
        if (fiveHundredCount > 0) {
            System.out.println("Five Hundred: " + fiveHundredCount);
        }

        int twoHundredCount = remainingAmount / 200;
        remainingAmount = remainingAmount %200;
        if (twoHundredCount > 0) {
            System.out.println("Two Hundred: " + twoHundredCount);
        }

        int hundredCount = remainingAmount / 100;
        if (hundredCount > 0) {
            System.out.println("Hundred: " + hundredCount);   
        }
    }
}

