package com.hands_on_collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Collections_Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> set = new TreeSet<>();

		while (true) {
			System.out.print("Enter a number (or type 'done' to finish): ");
			String input = sc.next();

			if (input.equalsIgnoreCase("done")) {
				break;
			}

			int num = Integer.parseInt(input);
			set.add(num);
		}

		System.out.println("Sorted unique numbers: " + set);

		
		int sum = 0;
		for (int num : set) {
			sum += num;
		}
		double avg = (double) sum / set.size();
		System.out.println("Average: " + avg);

		System.out.println("Lowest: " + set.first());
		System.out.println("Highest: " + set.last());

		System.out.print("Odd numbers: [");
		boolean first = true;

		for (int num : set) {
			if (num % 2 != 0) {
				if (!first) System.out.print(", ");
				System.out.print(num);
				first = false;
			}
		}
		System.out.println("]");

		sc.close();
	}
}