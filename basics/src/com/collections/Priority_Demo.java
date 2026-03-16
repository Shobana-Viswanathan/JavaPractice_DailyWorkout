//This example demonstrates the prority
package com.collections;
import java.util.*;
public class Priority_Demo {

	public static void main(String[] args) {
		PriorityQueue<String>priorityQueue=new PriorityQueue<>();
		priorityQueue.add("c");
		priorityQueue.add("b");
		priorityQueue.add("a");
		priorityQueue.add("e");
		priorityQueue.add("f");
		priorityQueue.add("d");
		System.out.println("Elements in the priority queue:");
		while(!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.poll());
		}
	}

}
