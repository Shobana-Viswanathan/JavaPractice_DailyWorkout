//This example demonstrates the vector class
package com.collections;

import java.util.Vector;

public class Vectordemo {
	public static void main(String[] args) {
    Vector<String>v=new Vector<String>(5);
    System.out.println("Size of the vector is "+v.size());
    v.add("A");
    v.add("B");
    v.add("C");
    v.add("D");
    System.out.println("Elements in the vector "+v);
    System.out.println("Size of the vector is "+v.size());
    System.out.println("Capacity "+v.capacity());
    


	}

}
