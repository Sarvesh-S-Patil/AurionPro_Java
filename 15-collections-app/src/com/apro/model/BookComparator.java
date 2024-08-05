package com.apro.model;

import java.util.Comparator;

public class BookComparator {
	
	public static class BookTitleComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			String title1= o1.getTitle();
			String title2=o2.getTitle();
			return title1.compareTo(title2);
		}
		
	}
	
	public static class BookAuthorComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			// TODO Auto-generated method stub
			String author1 = o1.getAuthor();
			String author2 = o2.getAuthor();
			return author1.compareTo(author2);
		}
		
	}
	
	public static class BookPriceComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			if(o1.getPrice()-o2.getPrice()>0) {
				return 1;
			}
			if(o1.getPrice()-o2.getPrice()<0) {
				return -1;
			}
			return 0;
		}
		
	}
	
	public static class BookPublicationYearComparator implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
			return o1.getPublicationYear()-o2.getPublicationYear();
		}
		
	}

}
