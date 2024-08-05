package com.apro.test;

import java.util.Scanner;

public class MatrixTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		System.out.println("Enter Matrix Elements : ");
		readMatrix(matrix, scanner);
		System.out.println("The Elements of Matrix are  : ");
		displayMatrix(matrix);
	}
	
	private static void displayMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			displayRows(matrix,i);
		}
	}

	private static void displayRows(int[][] matrix, int i) {
		for(int j=0;j<3;j++) {
			System.out.print(matrix[i][j]+ " ");
		}
		System.out.println();
	}

	public static void readMatrix(int[][] matrix,Scanner scanner) {
		for(int i=0;i<matrix.length;i++) {
			readRows(matrix,scanner,i);
		}
	}
	
	public static void readRows(int[][] matrix,Scanner scanner, int row) {
		for(int j=0;j<3;j++) {
			matrix[row][j]=scanner.nextInt();
		}
	}
}
