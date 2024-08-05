package com.apro.test.programs.SystemArgs;



public class DistanceCalculator {

    public static void main(String[] args) {

        System.out.println("Welcome to the Distance Calculator!");
        
        int x1 = Integer.parseInt(args[0]);
        int y1 = Integer.parseInt(args[1]);

        
        int x2 =  Integer.parseInt(args[2]);
        int y2 =  Integer.parseInt(args[3]);

        double distance = calculateDistance(x1, y1, x2, y2);

        System.out.println("The distance between the points ("+x1+","+y1+") and ("+x2+","+y2+") is: "+distance);
    }

    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

