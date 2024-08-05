package com.apro.test;

import java.util.Scanner;

import com.apro.model.Box;

public class BoxTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details of box1 - ");
		System.out.println("Enter height : ");
		int h =sc.nextInt();
		
		System.out.println("Enter width : ");
		int w =sc.nextInt();
		
		System.out.println("Enter depth : ");
		int d =sc.nextInt();
		Box box1 = new Box(h,w,d);
		System.out.println("Details of box 1 are as follows : ");
		System.out.println("Height : "+box1.getHeight());
		System.out.println("Width  : "+box1.getWidth());
		System.out.println("Depth : "+box1.getDepth());
		System.out.println();
		
		// BOX 2
		
		
		System.out.println("Enter Details of box2 - ");
		System.out.println("Enter height : ");
		h =sc.nextInt();
		System.out.println("Enter width : ");
		w =sc.nextInt();
		System.out.println("Enter depth : ");
		d =sc.nextInt();
		Box box2 = new Box(h,w,d);
		// display
		
		System.out.println("Details of box 2 are as follows : ");
		System.out.println("Height : "+box2.getHeight());
		System.out.println("Width  : "+box2.getWidth());
		System.out.println("Depth : "+box2.getDepth());
		
		Box box3 = new Box();
		System.out.println("Details of box 3 are as follows : ");
		System.out.println("Height : "+box3.getHeight());
		System.out.println("Width  : "+box3.getWidth());
		System.out.println("Depth : "+box3.getDepth());
		
		
		
	}

}
