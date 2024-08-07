package com.apro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(21,30,43,57,60);
		Stream<Integer> numbersStream = numbers.stream();
		numbersStream.forEach((number) -> System.out.println(number));
		System.out.println("Odd Numbers : ");
		List<Integer> list =numbers.stream()
				.filter((number) -> number %2 !=0)
				.filter((number)-> number >25)
				.collect(Collectors.toList());
		
		list.stream()
			.forEach((number)-> System.out.println(number));
		
		System.out.println("Squared list of numbers : ");
		List<Integer> squareList = numbers.stream()
										.map((number) -> number*number)
										.collect(Collectors.toList());
		squareList.stream().forEach((number)-> System.out.println(number));
		
		int sum = numbers.stream()
						.reduce(0, (number1,number2)->number1+number2);
		System.out.println("Sum of all elements : "+sum);
		
		List<Integer> sortedNumbers = numbers.stream()
											.sorted(Collections.reverseOrder())
											.limit(3)
											.collect(Collectors.toList());
		//sortedNumbers.sort(Collections.reverseOrder());
		System.out.println("Sorted list of numbers : ");
		sortedNumbers.forEach((number)-> System.out.println(number));
		
		//max of numbers
		Optional<Integer> max =numbers.stream().max((number1,number2)->number1-number2);
		if(max.isPresent())
			System.out.println("maximum value is "+max.get());
		
		Optional<Integer> min =numbers.stream().min((number1,number2)->number1-number2);
		if(min.isPresent())
			System.out.println("Minimum is "+min.get());
		
		
		
		
		
	}

}
