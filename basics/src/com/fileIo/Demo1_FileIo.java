package com.fileIo;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
public class Demo1_FileIo {
	public static void main(String[] args) {
    FileSystem fs=FileSystems.getDefault();
    Path p1=fs.getPath("C:\\Users\\Hp\\OneDrive\\Desktop\\Demo2");
    Path p2=p1.subpath(1, 3);
    System.out.println(p1);
    System.out.println(p2);
	}

}
