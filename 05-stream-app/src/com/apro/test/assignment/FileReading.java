package com.apro.test.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\assignment\\newFile.txt");
			Scanner scanner = new Scanner(file);
			System.out.println("Name of the file : "+file.getName());
			System.out.println("Length of file in bytes : "+file.length());
			System.out.println("Content of file - ");
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
