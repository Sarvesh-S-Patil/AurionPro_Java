package com.apro.test.programs.Scanner;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Minute Converter!");
        System.out.println("Please enter the number of minutes:");

        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60; 
        int minutes = totalMinutes % 60; 

        System.out.println(totalMinutes+" minutes is equal to "+hours+" hours and "+minutes+" minutes.");
    }
}

