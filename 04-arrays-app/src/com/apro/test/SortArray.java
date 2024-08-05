package com.apro.test;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter your array numbers :");
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			for(int j=1;j<size-i;j++) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
			}
		}
		for(int element : arr) {
			System.out.print(element+" ");
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
}
