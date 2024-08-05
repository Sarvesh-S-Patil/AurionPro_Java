package com.apro.model;
import java.util.Scanner;
public class ProductOfElements {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int[] result = new int[n];
	        int prefix = 1;
	        for (int i = 0; i < n; i++) {
	            result[i] = prefix;
	            prefix *= arr[i];
	        }

	        int suffix = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            result[i] *= suffix;
	            suffix *= arr[i];
	        }

	        System.out.println("Product array except self:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(result[i] + " ");
	        }

	    }

}
