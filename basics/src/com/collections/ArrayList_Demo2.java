//This example demonstrates the ArrayList classes
package com.collections;

import java.util.ArrayList;
public class ArrayList_Demo2 {
	
	public static void main(String[] args) {
		ArrayList<Integer>arr=new ArrayList<Integer>();
		System.out.println("Intialize size of the array list is"+arr.size());
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("After insert the  size of array list is "+arr.size());
		System.out.println("Contents of ArrayList"+arr);
		Integer ia[]=new Integer[arr.size()];
		ia=arr.toArray(ia);
		int s=0;
		for(int i:ia) {
			s+=i;
		}
		System.out.println("Sum value is "+s);
	}
	
	
}



