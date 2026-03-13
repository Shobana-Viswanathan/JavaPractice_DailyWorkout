package com.fileIo;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
    String data="Welcome to Java Portal!! Have a happy learning";
    try {
    	 FileOutputStream output = new FileOutputStream("output.txt");
    	byte[] array=data.getBytes();
    	output.write(array);
    	output.close();
    	
    }
    catch(Exception e){
    	System.out.println(e);
    }
	}

}
