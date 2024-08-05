package com.apro.test;
import java.util.Scanner;
public class Swapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter First number : ");
		int num1 =Integer.parseInt(args[0]);
		//System.out.println("Enter Second number : ");
		int num2=Integer.parseInt(args[1]);
		System.out.println("Before Swapping : ");
		System.out.println("Number 1 : "+num1+" Number 2 : "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 =num1-num2;
		System.out.println("After Swapping : ");
		System.out.println("Number 1 : "+num1+" Number 2 : "+num2);

	}

}
