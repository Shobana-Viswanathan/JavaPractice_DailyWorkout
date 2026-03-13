package com.fileIo;

import java.io.FileInputStream;

public class FileInputStream_demo {

	public static void main(String[] args) {
    try {
    	FileInputStream input=new FileInputStream("input.txt");
    	System.out.println("Data in the file.");
    	int i=input.read();//reads the first byte
    	while(i != -1) {
    		System.out.print((char)i);
    		i=input.read();
    	}
    	input.close();
    	
    	
    }
    catch(Exception e){
    	System.out.println(e);
    }
	}

}
