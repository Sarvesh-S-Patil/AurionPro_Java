package com.apro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\test1.txt");
			FileOutputStream fileOutputStream= new FileOutputStream("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\test2.txt");
			int ch;
			while( (ch=fileInputStream.read()) != -1) {
				fileOutputStream.write(ch);
			}
			System.out.println("File Copied Successfully");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
