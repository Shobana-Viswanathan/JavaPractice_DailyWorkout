/*
 * This example demonstrates the difference between String,String Builder,String Buffer class
 */
package com.string;
import java.util.Scanner;
public class DemoString {
	public static void concat1(String s1) {
		s1=s1+"Ram";
		}
	public static void concat2(StringBuilder s2) {
		s2.append("Raj");
	}
	public static void concat3(StringBuffer s3) {
		s3.append("Ravi");
	}
	
	public static void main(String[] args) {
  String s1="Hello";
  concat1(s1);
  System.out.println("String "+s1);
  StringBuilder s2=new StringBuilder("Hello, ");
  concat2(s2);
  System.out.println("StringBuilder "+s2);
  StringBuffer s3=new StringBuffer("Hello, ");
  concat3(s3);
  System.out.println("StringBuffer "+s3);
	}

}
