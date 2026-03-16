/*
 * This example demonstrates the arraylist classes
 */
package com.collections;

import java.util.ArrayList;

public class Arraylist_demo {

	public static void main(String[] args) {
    ArrayList<String>Arr=new ArrayList<String>();
    System.out.println("Initial Size of Array List is "+Arr.size());
    Arr.add("C");
    Arr.add("A");
    Arr.add("E");
    Arr.add("B");
    Arr.add("D");
    Arr.add("F");
    Arr.add(1,"G");
    System.out.println("after insert the size of array list is: "+Arr.size());
    System.out.println("Contents of ArrayList: "+Arr);
    Arr.remove("F");
    Arr.remove(2);
    System.out.println("Contents of ArrayList :"+Arr);
	}

}
