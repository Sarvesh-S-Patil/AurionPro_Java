package com.apro.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilerReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("C:\\Users\\sarvesh.patil\\Downloads\\test.txt");
			int ch;
			while((ch = fileReader.read() )!=-1) {
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
