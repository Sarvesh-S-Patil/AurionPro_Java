package com.apro.test.assignment;

import java.util.Scanner;

public class SortedSquares {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter sorted array elements : ");
		for(int i=0;i<size;i++) {
			int input = scanner.nextInt();
			array[i]=input;
		}
		int[] result = new int[size];
		int low = 0;
		int high = size-1;
		int idx=size-1;
		while(low<=high) {
			if(Math.abs(array[low])>Math.abs(array[high])) {
				result[idx]=array[low]*array[low];
				idx--;
				low++;
			}
			else {
				result[idx]=array[high]*array[high];
				high--;
				idx--;
			}
		}
		System.out.println("The sorted squared elements of array are : "); 
		for(int element:result) {
			System.out.print(element+" ");
		}
	}

}
