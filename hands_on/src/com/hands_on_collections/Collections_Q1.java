package com.hands_on_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Collections_Q1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("How many names do you want to input? ");
		int n = sc.nextInt();
		sc.nextLine();   
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name #" + (i + 1) + ": ");
			String name = sc.nextLine();
			list.add(name);
		}
		System.out.println("Names longer than 5 characters:");
		for (String names : list) {
			if (names.length() > 5) {
				System.out.println(names);
			}
		}
		
		sc.close();}}
		





	