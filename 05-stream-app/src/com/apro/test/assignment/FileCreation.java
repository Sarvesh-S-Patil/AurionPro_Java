package com.apro.test.assignment;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\assignment\\newFile.txt");
			if(file.createNewFile()) {
				System.out.println("New File Created Successfully");
			}
			else {
				System.out.println("File creation error");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
