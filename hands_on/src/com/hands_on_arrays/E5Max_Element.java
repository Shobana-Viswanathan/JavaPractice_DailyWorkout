/**
 * This program reads n elements into an array and finds the greatest element in it.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class E5Max_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The greatest element is: " + max);
		sc.close();
	}}

		



       

        



	


