package com.apro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AreaCalculatorTest {
	AreaCalculator areaCalculator;
	@BeforeEach
	public void init() {
		areaCalculator= new AreaCalculator();
	}

	@Test
	void testAreaOfCircle() {
		assertEquals(314, areaCalculator.areaOfCircle(10) );
	}

	@Test
	void testAreaOfRectangle() {
		assertEquals(200, areaCalculator.areaOfRectangle(10, 20));
	}

	@Test
	void testAreaOfTriangle() {
		assertEquals(100, areaCalculator.areaOfTriangle(10, 20));
	}

	
	@Test
	void testIsEven() {
		assertTrue(areaCalculator.isEven(2));
	}
}
