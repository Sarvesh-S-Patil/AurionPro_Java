package com.apro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationsTest {
	Operations operation;
	@BeforeEach
	void init(){
		operation = new Operations();
	}

	@Test
	void testAdd() {
		
		int actual = operation.add(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
	
	@Test
	void testMultiply() {
		assertEquals(5,operation.multiply(5, 10),"Multiplication Failed");
	}
	
	@Test
	void testSubtract() {
		assertEquals(10,operation.subtract(15, 5));
	}
	

}
