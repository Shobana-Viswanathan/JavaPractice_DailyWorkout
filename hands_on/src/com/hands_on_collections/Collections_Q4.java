package com.hands_on_collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
public class Collections_Q4 {
	public static void pushStudents(HashMap<String, Integer> map, Stack<String> stack) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			
			if (entry.getValue() > 75) {
				stack.push(entry.getKey());
			}
		}
	}
	public static void popStudents(Stack<String> stack) {
		System.out.println("Student Marks above 75 in the stack:");
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter student name: ");
			String name = sc.nextLine();
			System.out.print("Enter marks: ");
			int marks = sc.nextInt();
			sc.nextLine();
			
			map.put(name, marks);
		}
		System.out.println("Student Marks in the HashMap: " + map);
		Stack<String> stack = new Stack<>();
		pushStudents(map, stack);
		popStudents(stack);
		sc.close();}}
		
		
		
			
		











