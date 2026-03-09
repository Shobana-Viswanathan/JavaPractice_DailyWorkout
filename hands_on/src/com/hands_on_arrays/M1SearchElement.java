/**
 * This program checks whether a specific element (key) 
 * is present in the given array or not.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class M1SearchElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int key = sc.nextInt();
		boolean found = false;
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				found = true;
				break;
			}
		}
		System.out.println(found);
		sc.close();}}




       




	
