package com.apro.test.programs.Scanner;

import java.util.Scanner;

public class TrapezoidArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of base 1: ");
        double base1 = scanner.nextDouble();

        System.out.print("Enter the length of base 2: ");
        double base2 = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double area = (base1 + base2) / 2 * height;

        System.out.println("The area of the trapezoid is: " + area);

    }
}

