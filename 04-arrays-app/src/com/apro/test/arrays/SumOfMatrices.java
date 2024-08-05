package com.apro.test.arrays;

import java.util.Scanner;

public class SumOfMatrices {
	public static void main(String[] args) {
		System.out.println("Enter Matrix 1 details - ");
		int[][] matrix1 = read_matrix();
		System.out.println("Enter Matrix 2 details - ");
		int[][] matrix2 = read_matrix();
		if(matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
			System.out.println("Invalid Input");
			return;
		}
		int row = matrix1.length;
		int column = matrix1[0].length;
		int[][] addition_matrix = add_matrix(matrix1,matrix2,row,column);
		System.out.println("Addition of two matrices is - ");
		print_matrix(addition_matrix, row, column);
		
	}
	
	private static int[][] add_matrix(int[][] matrix1, int[][] matrix2, int row, int column) {
		int[][] result = new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				result[i][j]=matrix1[i][j]+ matrix2[i][j];
			}
		}
		return result;
	}

	public static int[][] read_matrix(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of rows of matrix 1 : ");
		int rows = scanner.nextInt();
		System.out.print("Enter number of columns of matrix 1 : ");
		int columns=scanner.nextInt();
		int[][] matrix = new int[rows][columns];
		System.out.println("Enter array elements : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				matrix[i][j]=scanner.nextInt();
			}
		}
		print_matrix(matrix, rows, columns);
		return matrix;
	}
	
	public static void print_matrix(int[][] matrix,int rows,int columns) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
