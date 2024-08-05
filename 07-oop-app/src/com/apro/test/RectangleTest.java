package com.apro.test;

import java.util.Scanner;

import com.apro.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter height and width of Rectangle 1 : ");
		int h = scanner.nextInt();
		int w = scanner.nextInt();
		Rectangle rect1 = new Rectangle(h,w);
		System.out.println("Height of rectangle1 is : "+rect1.getHeight());
		System.out.println("Height of rectangle1 is : "+rect1.getWidth());
		System.out.println("Area of rectangle is : " +rect1.calculateArea());
		
		System.out.println("Enter height and width of Rectangle 2 : ");
		h = scanner.nextInt();
		w = scanner.nextInt();
		Rectangle rect2 = new Rectangle(h,w);
		System.out.println("Height of rectangle2 is : "+rect2.getHeight());
		System.out.println("Height of rectangle2 is : "+rect2.getWidth());
		System.out.println("Area of rectangle is : " +rect2.calculateArea());
	}

}
