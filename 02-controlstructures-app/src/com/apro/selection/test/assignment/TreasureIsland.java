package com.apro.selection.test.assignment;

import java.util.Scanner;

public class TreasureIsland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Treasure Island.");
        System.out.println("Your mission is to find the treasure.");
        
        System.out.println("Enter your direction : left or right? ");
        String direction = scanner.nextLine();
        
        if (direction.equals("left")) {
            System.out.println("Enter your choice : swim or wait? ");
            String action = scanner.nextLine();
            
            if (action.equals("wait")) {
                System.out.println("Enter your choice : Which door? Red, Blue, or Yellow? ");
                String door = scanner.nextLine();
                switch (door) {
                    case "Red":
                        System.out.println("Burned by fire. Game Over.");
                        break;
                    case "Blue":
                        System.out.println("Eaten by beasts. Game Over.");
                        break;
                    case "Yellow":
                        System.out.println("You Win!");
                        break;
                    default:
                        System.out.println("Game Over.");
                        break;
                }
            } 
            else {
                System.out.println("Attacked by trout. Game Over.");
            }
        } 
        else {
            System.out.println("Fall into a hole. Game Over.");
        }
    }
}
