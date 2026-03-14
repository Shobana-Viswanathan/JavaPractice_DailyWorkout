/*
 *  This program is to check the last modified time
 */
package com.hands_on_fileHandling;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;
import java.io.IOException;
public class FileHandling_E4 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("demo.txt");
		FileTime time = Files.getLastModifiedTime(path);
		System.out.println("Last Modified Time: " + time);
	}
	}





