//Java program to demonstrate the soft link
package com.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SofLink_Io {

	public static void main(String[] args) {
    Path existingFilePath = Paths.get("C:\\Users\\Hp\\OneDrive\\Desktop\\Demo2");
    Path symLinkPath = Paths.get("C:\\Doc3.txt");
    try {
    	Files.createSymbolicLink(symLinkPath, existingFilePath);
    }
    catch(IOException x) {
    	System.out.println(x);
    }
    catch(UnsupportedOperationException x) {
    	// some files system do not  support symbolic links
    	System.err.println(x);
    }
	}}


