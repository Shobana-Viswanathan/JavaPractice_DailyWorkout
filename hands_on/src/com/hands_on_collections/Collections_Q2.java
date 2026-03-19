package com.hands_on_collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Collections_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> s = new LinkedHashSet<>();
		System.out.print("How many strings do you want to enter? ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string " + (i + 1) + ": ");
			String str = sc.nextLine();
			s.add(str);
		}
		Iterator<String> it = s.iterator();
		String result = "";
		while (it.hasNext()) {
			String element = it.next();
			System.out.println("Elements in the Set : " + element);
			result = result + element + " ";
		}
		System.out.println("Concatenated result: " + result);
		sc.close();
	}
}









