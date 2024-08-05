package com.apro.test.programs.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class DistanceCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Distance Calculator!");
        System.out.println("Enter the coordinates of the first point (x1 y1):");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the coordinates of the second point (x2 y2):");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("The distance between the points ("+x1+","+y1+") and ("+x2+","+y2+") is: "+distance);
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

