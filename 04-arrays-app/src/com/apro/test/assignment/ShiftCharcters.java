package com.apro.test.assignment;

import java.util.Scanner;

public class ShiftCharcters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String (Only alphabets are allowed ) : ");
		String input = scanner.nextLine();
		System.out.println("Enter number of characters to shift : ");
		int shift = scanner.nextInt();
		shift = shift%26;
		char[] input_array = input.toCharArray();
		char[] result = new char[input.length()];
		int idx=0;
		for(int i=0;i<input.length();i++) {
			int val = (int)input_array[i]; 
			if(65<=val && val<=90) {
				int temp = val+shift;
				if(temp>90) {
					temp =  65+ (temp%90)-1;
				}
				if(temp<65) {
					temp = 90-(65-temp)+1;
				}
				result[i]=(char)temp;
			}
			else if(97<=val && val<=122){
				int temp = val+shift;
				if(temp>122) {
					temp = 97 + (temp%122)-1;
				}
				if(temp<97) {
					temp = 122-(97-temp)+1;
				}
				result[i]=(char)temp;
				
			}
			else {
				System.out.println("Invalid Input");
				return;
			}
		}
		System.out.println("Value of shifted string is : "+ input.valueOf(result));
	}

}
