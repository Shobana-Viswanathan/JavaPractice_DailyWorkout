//This program to find the longest word in a text file. 
package com.hands_on_fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_E1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		String longest = "";
		String line;
		while ((line = br.readLine()) != null) {
			String[] words = line.split(" ");
			for (String w : words) {
				if (w.length() > longest.length()) {
					longest = w;
				}
			}
		}
		
		br.close();
		
		System.out.println("Longest word: " + longest);
	}
	
}




