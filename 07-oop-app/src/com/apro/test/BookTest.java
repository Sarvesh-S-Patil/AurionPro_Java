package com.apro.test;

import java.util.Scanner;

import com.apro.model.Book;
import com.apro.model.CricketPlayer;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number of Books ");
		int no_of_books =scanner.nextInt();
		scanner.nextLine();
		Book[] books= new Book[no_of_books];
		for(int i=0;i<no_of_books;i++) {
			System.out.println("Enter Book ID : ");
			int bookId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Book Name : ");
			String name=scanner.nextLine();
			System.out.println("Enter Book Author Name : ");
			String authorName=scanner.nextLine();
			System.out.println("Enter Book Price : ");
			int price=scanner.nextInt();
			scanner.nextLine();
			books[i]=new Book(bookId, name, authorName, price);
		}
		sortBooks(books);
		System.out.println("Sorted Order of Books - ");
		display(books);
	}
	
	private static void display(Book[] books) {
		for(Book book :books) {
			System.out.println("Book Name : "+book.getName());
			System.out.println("Price of Book : "+book.getPrice());
			
		}
		
	}

	public static void sortBooks(Book[] books) {
		for(int i=0;i<books.length;i++) {
			for(int j=1;j<books.length-i;j++) {
				if(books[j-1].getPrice()  < books[j].getPrice()) {
					Book temp = books[j-1];
					books[j-1]=books[j];
					books[j]=temp;
				}
			}
		}
		
	}
}
