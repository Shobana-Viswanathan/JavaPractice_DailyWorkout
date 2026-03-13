// This example demonstrate bounded type
package com.generics;
public class GenericMethod2 {
// A generic method with bounded type
	static <T extends Number>T genericDisplay(T one,T two){
		return(T)(Integer)(one.intValue()+two.intValue());
	}

	public static void main(String[] args) {
   System.out.println(genericDisplay(11,5));
 //  System.out.println(genericDisplay("Generics","Test"));
   System.out.println(genericDisplay(1.0,3.0));
	}

}
