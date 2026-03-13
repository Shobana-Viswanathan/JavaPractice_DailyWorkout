package com.hands_on_fileHandling;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandling_E3 {

	public static void main(String[] args) {
		   Path p=Paths.get("C:\\Users\\Hp\\OneDrive\\Desktop\\Demo2");
		   boolean res=Files.exists(p);
		   System.out.println(res);
	}

}
