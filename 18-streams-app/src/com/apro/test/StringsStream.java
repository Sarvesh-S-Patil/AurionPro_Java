package com.apro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringsStream {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ramesh","Suresh","Vinayak","Devansh","Pranay","Balwinder","Ram");
		
		List<String> namesAscending = names.stream()
											.sorted()
											.limit(3)
											.collect(Collectors.toList());
		System.out.println("First three sorted names : ");
		namesAscending.stream().forEach((name)->System.out.println(name));
		
		List<String> namesContainingAandAscending = names.stream()
														.filter((name)-> name.contains("a"))
														.sorted()
														.limit(3)
														.collect(Collectors.toList());
		System.out.println("First three sorted names containg a : ");
		namesContainingAandAscending.stream().forEach((name)->System.out.println(name));
		
		List<String> namesDescending = names.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println("Sorted nammes in descending order : ");
		namesDescending.stream().forEach((name)->System.out.println(name));
		
		
		List<String> namesFirstThreeChars = names.stream()
												.filter((name)->name.length()>=3)
												.map((name)-> name.substring(0, 3))
												.collect(Collectors.toList());
		
		System.out.println("First Three Characters of names : ");
		namesFirstThreeChars.stream().forEach((name)->System.out.println(name));
		
		List<String> namesWithMinLengthFour = names.stream()
												.filter((name)->name.length()>=4)
												.collect(Collectors.toList());
		System.out.println("Names with minimum length four : ");
		namesWithMinLengthFour.stream().forEach((name)->System.out.println(name));
		
		
		
	}

}
