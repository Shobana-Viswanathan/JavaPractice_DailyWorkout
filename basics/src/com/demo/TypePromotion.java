package com.demo;
/**
 * The TypePromotion class implements an application that
 * Illustrate the type promotion
 */
public class TypePromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte b=50;
      b=(byte)(b*2); // promote into int
      System.out.println(b);
      
	}

}
