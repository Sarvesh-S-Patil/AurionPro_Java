package com.apro.test.assignment;

import java.util.Scanner;

public class MatrixMultiplication{
	public static void main(String[] args) {
		System.out.println("Enter Matrix 1 details - ");
		int[][] matrix1 = read_matrix();
		System.out.println("Enter Matrix 2 details - ");
		int[][] matrix2 = read_matrix();
		if(matrix1[0].length != matrix2.length) {
			System.out.println("Invalid Input");
			return;
		}
		int[][] multiply_matrix = multiply_matrix(matrix1,matrix2);
		int row = multiply_matrix.length;
		int column= multiply_matrix[0].length;
		System.out.println("Multiplication of two matrices is - ");
		print_matrix(multiply_matrix, row, column);
		
	}
	
	private static int[][] multiply_matrix(int[][] matrix1, int[][] matrix2) {
		int row1= matrix1.length;
		int col1=matrix1[0].length;
		int row2=matrix2.length;
		int col2=matrix2[0].length;
		
		int[][] result = new int[row1][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				 for (int k = 0; k < col1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
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

