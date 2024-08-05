package com.apro.test.assignment;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
	public static void main(String[] args) {
		Book book1 = new Book(1,"Alchemist","Paulo Cohelo ");
		try {
			FileOutputStream fos = new FileOutputStream("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\assignment\\bookInfo.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(book1);
			System.out.println("Object Stream Write Sucessful. ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
