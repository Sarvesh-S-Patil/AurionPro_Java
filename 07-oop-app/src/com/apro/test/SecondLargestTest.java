package com.apro.test;

import java.util.Scanner;

public class SecondLargestTest {
	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter Array elements seperated by spaces : ");
		for(int i=0;i<size;i++) {
			array[i]=scanner.nextInt();
		}
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		if(size==0) {
			System.out.println("Array Contains only one element");
		}
		for(int temp:array) {
			if(temp>max1) {
				max2=max1;
				max1=temp;
			}
			else if(temp>max2 && temp != max1) {
				max2=temp;
			}
		}
		if(max2 != Integer.MIN_VALUE) {
			System.out.println("Second Largest Element of the Array is  : "+max2);
		}
		else {
			System.out.println("There is no second largest element. ");
		}
		
	}

}
