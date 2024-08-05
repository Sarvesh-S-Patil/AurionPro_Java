package com.apro.test;

import com.apro.Model.Rectangle;
import com.apro.Model.Triangle;
import com.apro.Model.Circle;
import com.apro.Model.Shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape shape = new Circle(20);
		shape.area();
		shape = new Rectangle(10,20);
		shape.area();
		shape = new Triangle(20, 30);
		shape.area();
	}

}
