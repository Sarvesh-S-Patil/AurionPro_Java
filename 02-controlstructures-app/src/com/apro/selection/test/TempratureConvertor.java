package com.apro.selection.test;
import java.util.Scanner;

public class TempratureConvertor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        
        int choice = scanner.nextInt();
        
        switch(choice) {
        	case 1:
        		 double farenheit = (temperature*9/5) + 32;
        		 System.out.println("The given Celsius to Farenheit is : "+farenheit+"°F");
        		 break;
        	case 2:
        		 double celsius = (temperature - 32) * 5/9;
        		 System.out.println("The given Farenheit to Celsius is : "+celsius+"°C");
        		 break;
        	case 3:
        		double kelvin = temperature + 273.15;
        		System.out.println("The given Celsius to kelvin is : "+kelvin+"°K");
        		break;
        	case 4:
        		double celsius2 = temperature-273.15;
        		System.out.println("The given Kelvin to Celsius is : "+celsius2+"°C");
        		break;
        	case 5:
        		double kelvin2 = ((temperature-32) * (5/9)) + 273.15 ;
        		System.out.println("The given Fahrenheit to Kelvin is : "+ kelvin2+"°K");
        		break;
        	case 6:
        		double farenheit2 = ((temperature - 273.15) * 9/5) + 32;
        		System.out.println("The given Kelvin to Fahrenheit is : "+ farenheit2+"°F");
        		break;
        	default:
        		System.out.println("Invalid choice");
        }
	}
}
