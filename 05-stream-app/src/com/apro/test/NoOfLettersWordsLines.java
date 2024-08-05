package com.apro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NoOfLettersWordsLines {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\AproJava Training\\05-stream-app\\src\\com\\apro\\test\\test1.txt");
            int ch;
            int char_count = 0;
            int word_count = 0;
            int line_count = 1; 

            boolean inWord = false; 

            while ((ch = fileInputStream.read()) != -1) {
                if ((char) ch != ' ' && (char) ch != '\t' && (char) ch != '\n') {
                    char_count++; 
                }

                
                if ((char) ch == ' ' || (char) ch == '\t' || (char) ch == '\n') {
                    if (inWord) {
                        word_count++;
                        inWord = false;
                    }
                    if ((char) ch == '\n') {
                        line_count++;
                    }
                } else {
                    if (!inWord) {
                        inWord = true;
                    }
                }
            }

            if (inWord) {
                word_count++;
            }

            if (char_count == 0) {
                word_count = 0;
                line_count = 0;
            }

            System.out.println("Char count is : " + char_count);
            System.out.println("Word count is : " + word_count);
            System.out.println("Line count is : " + line_count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
