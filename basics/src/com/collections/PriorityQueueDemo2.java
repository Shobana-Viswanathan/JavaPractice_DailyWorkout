//This example demonstrates the PriorityQueue class with priority
package com.collections;
import java.util.*;
class Task implements Comparable<Task>{
	private String name;
	private int priority;
	public Task(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	
	public int getPriority() {
		return priority;
	}
	public int compareTo(Task other) {
		return Integer.compare(other.priority,this.priority);
	}
}
public class PriorityQueueDemo2 {
	public static void main(String[] args) {
    PriorityQueue<Task>priorityqueue=new PriorityQueue<>();
    priorityqueue.add(new Task("Task 1",3));
    priorityqueue.add(new Task("Task 2",1));
    priorityqueue.add(new Task("Task 3",2));
    while(!priorityqueue.isEmpty()) {
		Task task = priorityqueue.poll();
		System.out.print("Task name: "+task.getName()+" Priority: "+task.getPriority()+"\n");

	}

}}
