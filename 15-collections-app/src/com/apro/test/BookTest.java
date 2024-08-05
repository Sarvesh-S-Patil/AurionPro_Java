package com.apro.test;

import java.util.ArrayList;
import java.util.Collections;

import com.apro.model.Book;
import com.apro.model.BookComparator;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Alchemist","Paulo Cohelo", 2000, 2002));
		books.add(new Book("Rich Dad Poor Dad","Robert Kiyosaki", 1500,2012));
		books.add(new Book("The Intelligent Investor","Benjamin Graham", 3000,1999));
		books.add(new Book("Ab","A",3000,1200));
		books.add(new Book("Ab","A",2000,1200));
		
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("Sorted the books first by author, then by title, and finally by price :");
		Collections.sort(books,new BookComparator.BookAuthorComparator().thenComparing(new BookComparator.BookTitleComparator().thenComparing(new BookComparator.BookPriceComparator())));
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("Sorted the books first by publication year, then by price, and finally by author :");
		Collections.sort(books,new BookComparator.BookPublicationYearComparator().thenComparing(new BookComparator.BookPriceComparator().thenComparing(new BookComparator.BookAuthorComparator())));
		for(Book book : books) {
			System.out.println(book);
		}
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println();
	}

}
