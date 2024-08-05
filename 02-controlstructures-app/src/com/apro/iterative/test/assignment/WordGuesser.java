package com.apro.iterative.test.assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class WordGuesser {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		wordList.addAll(Arrays.asList("wrap", "yellow", "spy", "start", "cheese", "quilt", "prize",
                "tin", "add", "grip", "handy", "hurried", "snore", "versed",
                "grateful", "place", "unit", "wakeful", "crazy","world"));
		Random random = new Random();
		int random_number = random.nextInt(19)+1;
		String random_string = wordList.get(random_number);
		System.out.println(random_string);
		char[]	word = random_string.toCharArray();
		char[] guess_word = new char[random_string.length()];
		Arrays.fill(guess_word, '_');
		System.out.println("Length of the word is : "+random_string.length());
		int no_of_lives=10;
		int valid_count=0;
		while(no_of_lives>0) {
			System.out.println("Number of lives left : "+no_of_lives);
			System.out.println("Guess a letter : ");
			char ch = scanner.next().charAt(0);
			boolean flag=false;
			for(int i=0;i<word.length;i++) {
				if(ch==word[i] ){
					guess_word[i]=ch;
					valid_count++;
					flag=true;
				}
			}
			if(flag==false) {
				no_of_lives--;
			}
			if(valid_count==word.length) {
				System.out.println(random_string.valueOf(guess_word));
				System.out.println("You Win !");
				break;
			}
			System.out.println(random_string.valueOf(guess_word));	
			}
		System.out.println("Game Over ! ");
		
	}

}
