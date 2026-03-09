/**
 * This program counts the number of duplicate and unique elements in an array.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class M3Duplicate_Unique {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Array elements are: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int duplicateCount = 0;
		int uniqueCount = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			int k;
			for (k = 0; k < i; k++) {
				if (arr[i] == arr[k])
					break;
			}
			if (k == i) {  
				if (count > 1)
					duplicateCount++;
				else
					uniqueCount++;
			}
		}
		System.out.println("No of duplicate element: " + duplicateCount);
		System.out.println("No of unique elements: " + uniqueCount);
		sc.close();}}







           


	

