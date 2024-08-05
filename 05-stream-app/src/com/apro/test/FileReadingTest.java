package com.apro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\test1.txt");
			int ch;
			while( (ch=fileInputStream.read()) != -1) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
