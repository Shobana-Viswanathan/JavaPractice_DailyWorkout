/**
 * Reads a text file and counts the frequency of each word.
 * Displays sorted word counts and total number of unique words with exception handling.
 */
package com.assessment3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Assessment_Q1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			File file = new File("words.txt");
			Scanner sc = new Scanner(file);
			
			while (sc.hasNext()) {
				String word = sc.next().toLowerCase();
				list.add(word);
			}
			sc.close();
			String[] words = list.toArray(new String[0]);
			Arrays.sort(words);
			int count = 1;
			int uniqueCount = 0;
			for (int i = 0; i < words.length; i++) {
				if (i < words.length - 1 && words[i].equals(words[i + 1])) {
					count++;
				} else {
					System.out.println(words[i] + ": " + count);
					uniqueCount++;
					count = 1;
				}
			}
			System.out.println("Unique words: " + uniqueCount);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: words.txt not found");
		}
	}}
			


		






		


