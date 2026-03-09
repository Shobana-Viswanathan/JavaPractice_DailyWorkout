package com.demo;
import java.util.Scanner;
public class ReadSomeInput {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter your Name: ");
	 String name=sc.next();
	 System.out.println("Hi, "+name+" .Welcome to the Training Program...");
	 sc.close();
 }
}
