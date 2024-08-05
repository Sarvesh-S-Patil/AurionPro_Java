package com.apro.model;

//
//- BookApp
//- Book(bookId, name, author, price).  Constructors. Getters, setters.
// - Create a test class to create n number of books and display books in descending order of price
public class Book {
	int bookId;
	String name;
	String authorName;
	int price;
	
	public Book() {
		
	}
	public Book(int bookId, String name, String authorName, int price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.authorName = authorName;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
