package com.demo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExistsFileCheck_Io {

	public static void main(String[] args) {
   Path p=Paths.get("C:\\Users\\Hp\\OneDrive\\Desktop\\Demo2");
   Boolean res=Files.exists(p);
   boolean result=Files.isReadable(p);
   System.out.println(res);
   System.out.println(result);
	}

}
