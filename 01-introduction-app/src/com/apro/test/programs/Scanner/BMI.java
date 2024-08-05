package com.apro.test.programs.Scanner;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the BMI calculator!");
        System.out.println("Please enter your weight (in kilograms):");
        double weight = scanner.nextDouble();

        System.out.println("Please enter your height (in meters):");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.printf("Your Body Mass Index (BMI) is: %.2f%n", bmi);
        printBMICategory(bmi);

    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void printBMICategory(double bmi) {
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are within a healthy weight range.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
    }
}

