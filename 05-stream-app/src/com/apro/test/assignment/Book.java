package com.apro.test.assignment;

import java.io.Serializable;

public class Book implements Serializable {
	private int bookId;
	private String bookName;
	private String authorName;
	
	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	
	public void display() {
		System.out.println("The book details are as follows : ");
		System.out.println("Book Id : "+bookId+" , Book Name : "+bookName+" , Author Name : "+authorName);
	}
}
