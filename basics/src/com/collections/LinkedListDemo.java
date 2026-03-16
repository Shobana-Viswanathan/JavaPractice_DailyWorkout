//This example demonstrate the LinkedList classes
package com.collections;
import java.util.*;
public class LinkedListDemo {
	public static void main(String[] args) {
    LinkedList<String>list=new LinkedList<String>();
System.out.println("Size at the beginning "+list.size());
list.add("Java");
list.add("C++");
list.add("JavaScript");
list.addFirst("#C");
list.addLast("Kotlin");
list.add(2,"Python");
System.out.println("Original Linked List"+list);
System.out.println("Size after addition "+list.size());
list.remove(5);
list.remove("#C");
System.out.println("New Linked list"+list);
System.out.println("Size after removal"+list.size());
	}

}
