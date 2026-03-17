//This  program to get specific files by extensions from a specified folder
package com.hands_on_fileHandling;
import java.io.File;
public class FileHandling_E2 {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\Hp\\OneDrive\\Desktop\\Expleo Training\\JavaPractice_DailyWorkout\\hands_on"); 
		String extension = ".txt";      
		File[] files = folder.listFiles();
		for (File f : files) {
			if (f.isFile() && f.getName().endsWith(extension)) {
				System.out.println(f.getName());
			}
		}}}




	