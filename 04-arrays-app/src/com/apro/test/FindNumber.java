package com.apro.test;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter your array numbers :");
		for(int i =0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter a number : ");
		int check = sc.nextInt();
		boolean flag = false;
		for(int element : arr) {
			if(element == check) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Element is present in the array");
		}
		else {
			System.out.println("Element is not present in the array");
		}
	}
}
