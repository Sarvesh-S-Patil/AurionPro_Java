package com.ocp.demo.test;
import com.ocp.demo.*;
public class ShapeTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println(rectangle.area());
		Circle circle = new Circle(10);
		System.out.println(circle.area());
	}

}
