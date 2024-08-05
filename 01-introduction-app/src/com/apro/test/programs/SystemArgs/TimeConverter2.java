package com.apro.test.programs.SystemArgs;



public class TimeConverter2 {

    public static void main(String[] args) {
        System.out.println("Welcome to the Minute Converter!");
        

        int totalMinutes =  Integer.parseInt(args[0]);;

        int hours = totalMinutes / 60; 
        int minutes = totalMinutes % 60; 

        System.out.println(totalMinutes+" minutes is equal to "+hours+" hours and "+minutes+" minutes.");
    }
}

