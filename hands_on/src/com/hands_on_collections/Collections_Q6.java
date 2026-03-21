package com.hands_on_collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Person {
	String firstName;
	String lastName;
	
	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class Collections_Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<>();
		System.out.print("Enter number of people: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter first name: ");
			String first = sc.nextLine();
			System.out.print("Enter last name: ");
			String last = sc.nextLine();
			list.add(new Person(first, last));
		}
		Collections.sort(list, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.firstName.compareTo(p2.firstName);
			}
		});
		System.out.println("\nSorted people by first name:");
		for (Person p : list) {
			System.out.println(p.firstName + " " + p.lastName);
		}
		sc.close();
	}
}











