/**
 * This program merges two arrays into a third array and displays all three arrays.
 */

package com.hands_on_arrays;
import java.util.Scanner;
public class E7Merge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		
		System.out.println("Enter array 1 elements:");
		for (int i = 0; i < n1; i++) {
			arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		
		System.out.println("Enter array 2 elements:");
		for (int i = 0; i < n2; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] arr3 = new int[n1 + n2];
		
		for (int i = 0; i < n1; i++) {
			arr3[i] = arr1[i];
		}
		
		for (int i = 0; i < n2; i++) {
			arr3[n1 + i] = arr2[i];
		}
		System.out.println("First Array:");
		for (int i = 0; i < n1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\nSecond Array:");
		for (int i = 0; i < n2; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("\nMerged Array:");
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		sc.close();
	}
}






        

     

   

        

       

