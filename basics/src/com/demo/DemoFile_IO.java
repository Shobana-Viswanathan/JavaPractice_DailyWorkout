package com.demo;
import java.nio.file.Path;
import java.nio.file.Paths;
public class DemoFile_IO {
	public static void main(String[] args) {
		Path p1=Paths.get("C:\\Users\\Hp\\OneDrive\\Desktop\\Demo2");
		Path p2=p1.subpath(1,3);
		System.out.println(p1);
		System.out.println(p2);
	}   
}





