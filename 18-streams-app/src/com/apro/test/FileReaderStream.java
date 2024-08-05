package com.apro.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderStream {
	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\sarvesh.patil\\Downloads\\test.txt"));
			lines.forEach((line)->System.out.println(line));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
