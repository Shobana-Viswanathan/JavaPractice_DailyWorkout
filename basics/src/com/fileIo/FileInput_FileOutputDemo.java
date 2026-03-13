package com.fileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class FileInput_FileOutputDemo {

	public static void main(String[] args) {
     byte[] b=new byte[128];
     try(FileInputStream fis=new FileInputStream("input.txt");
     FileOutputStream fos=new FileOutputStream("output.txt"))
     {
          	 System.out.println("Bytes available. "+fis.available());
          	 int count=0, read=0;
          	 while((read=fis.read(b))!=-1) {
          		 fos.write(b);
          		 count += read;
          	 }
          	 System.out.println("Total Count "+count);
     }
     catch(FileNotFoundException f) {
    	 System.out.println("File not Found "+f);
     }
     catch(IOException e) {
    	 System.out.println("IOExceptiom "+e);
     }
	}

}
