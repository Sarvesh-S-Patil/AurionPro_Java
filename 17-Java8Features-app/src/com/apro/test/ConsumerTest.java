package com.apro.test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Integer> square = (Integer number)->System.out.println("Square of number is : "+number*number);
		square.accept(2);
		Consumer<String> name = (String yourName)->System.out.println("Name : "+yourName);
		name.accept("Sarvesh");
		
		BiConsumer<Integer,Integer> additionConsumer = (Integer number1,Integer number2)->System.out.println("Addition :"+(number1+number2));
		additionConsumer.accept(10, 20);
	}

}
