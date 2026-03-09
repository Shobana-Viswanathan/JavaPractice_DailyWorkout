package com.demo;

/**
 * The ConversionExplicit class implements an application that
 * Illustrate the explicit type conversion
 */
public class Conversion_type_explicit {
	public static void main(String[]args) {
		double d = 100.04;
		long l = (long)d; //convert double into long
		int i = (int)l; // long convert into int
		System.out.println("Double value "+d);
		System.out.println("Long value "+l);
		System.out.println("Int value "+i);
		
	}

}
