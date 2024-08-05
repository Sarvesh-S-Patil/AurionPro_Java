package com.techlabs.test;

import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;

import java.util.Arrays;

import com.techlabs.model.Circle;
import com.techlabs.model.Triangle;

public class ShapeTest {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		final int[] array = {10,20,30};
		array[0]=2;
		System.out.println(Arrays.toString(array));
		circle.area();
		Rectangle rectangle = new Rectangle(10,20);
		rectangle.area();
		Triangle triangle = new Triangle(10, 20);
		triangle.area();
		Shape shape = new Triangle(20, 50);
		shape.area();
	}

}
