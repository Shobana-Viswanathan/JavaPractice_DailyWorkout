/**
 * This program demonstrates method overloading
 */
package com.oops;

public class DemoAddOverLoad {
 static int add(int a,int b) {
	 return a+b;
 }
 static double add (double a,double b) {
	 return a+b;
 }

	public static void main(String[] args) {
	System.out.println(DemoAddOverLoad.add(10, 11));
	System.out.println(DemoAddOverLoad.add(11.0,10.1 ));

	}

}
