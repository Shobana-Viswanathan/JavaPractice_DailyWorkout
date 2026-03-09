/**
 * This program removes duplicate elements from an array 
 * and creates a new array containing only unique elements.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class M4RemDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] unique = new int[n];
		
		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = 0;
		
		for (int i = 0; i < n; i++) {
			
			int found = 0;
			
			for (int j = 0; j < k; j++) {
				if (arr[i] == unique[j]) {
					found = 1;
					break;
				}
			}
			
			if (found == 0) {
				unique[k] = arr[i];
				k++;
			}
		}
		System.out.println("Array after removing duplicates:");
		for (int i = 0; i < k; i++) {
			System.out.print(unique[i] + " ");
		}
		
		sc.close();
		
	}
	
}




