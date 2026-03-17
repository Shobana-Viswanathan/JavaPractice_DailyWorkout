//This  program to read a file line by line and store it into a variable
package com.hands_on_fileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling_E5 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
		 String line;
		 String content = "";  
		 while ((line = br.readLine()) != null) {
			 content = content + line + "\n";
		 }
		 br.close();
		 
		 System.out.println(content);}}

