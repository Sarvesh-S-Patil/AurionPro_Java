package com.apro.test.arrays;

import java.util.Scanner;

public class SearchArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns: ");
		int columns=scanner.nextInt();
		int[][] matrix = new int[rows][columns];
		System.out.println("Enter array elements : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Enter element to search in array : ");
		int search = scanner.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				if(matrix[i][j]==search) {
					System.out.println("ELement is present in the array");
					return;
				}
			}
		}
		System.out.println("Element is not present in the array");
	}

}
