/**
 * Returns first two characters of a string using substring.
Adds '@' for missing characters if the string length is less than 2
 */
package com.assessment3;
import java.util.Scanner;
public class Assessment_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input ");
		String input = sc.nextLine();
		String result = "";
		if (input.length() >= 2) {
			result = input.substring(0, 2);
		} else if (input.length() == 1) {
			
			result = input + "@";
		} else {
			result = "@@";
		}
		System.out.println(result);
		sc.close();
	}
}





