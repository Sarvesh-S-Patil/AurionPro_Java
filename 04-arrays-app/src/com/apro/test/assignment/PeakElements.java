package com.apro.test.assignment;

import java.util.Scanner;

public class PeakElements {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter length of the array : ");
		int size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<size;i++) {
			int input = scanner.nextInt();
			array[i]=input;
		}
		int peak_count =0;
		int[] peak_elements= new int[size];
		int idx=0;
		if(array.length==0) {
			System.out.println("No of Peak Elements : "+0);
			return;
		}
		if(array.length==1) {
			System.out.println("No of Peak Elements : "+1);
			peak_elements[0]=array[0];
			return;
		}
		for(int i=0;i<size;i++) {
			if(i==0) {
				if(array[1]<array[0]) {
					peak_elements[idx]=array[i];
					idx++;
					peak_count++;
				}
			}
			else if(i==size-1){
				if(array[i]>array[i-1]) {
					peak_elements[idx]=array[i];
					idx++;
					peak_count++;
				}
			}
			else {
				if(array[i-1]<array[i] && array[i]>array[i+1]) {
					peak_elements[idx]=array[i];
					idx++;
					peak_count++;
				}
			}
		}
		System.out.println("No of Peak Elements : "+peak_count);
		System.out.print("Peak Elements are : ");
		for(int i=0;i<peak_count;i++) {
			System.out.print(peak_elements[i]+" ");
		}
	}

}
