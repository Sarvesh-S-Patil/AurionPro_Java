package com.apro.test.assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) {
		FileInputStream fis;
		try {
			fis = new FileInputStream("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\assignment\\bookInfo.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Book book_read_object = (Book)ois.readObject();
			book_read_object.display();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
