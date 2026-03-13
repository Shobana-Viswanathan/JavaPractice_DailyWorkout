package com.generics;

public class GenricsMethod {
  static<T> void genericDisplay(T element) {
	  System.out.println(element);
	  System.out.println(element.getClass().getName()+"="+element);
  }
	public static void main(String[] args) {
 // calling generic method with integer argument
		genericDisplay(11);
		//calling genric method with string argument
		genericDisplay("Test");
		//calling generic method with double argument
		genericDisplay(1.0);
	}

}
