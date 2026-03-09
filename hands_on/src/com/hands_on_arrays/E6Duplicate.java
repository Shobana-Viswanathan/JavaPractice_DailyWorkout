/**
 * This program finds and prints the duplicate elements in an integer array.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class E6Duplicate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of elements : ");
	int in = sc.nextInt();
	int arr[] = new int[in];

	System.out.println("Enter the elements");
	for(int i=0;i<arr.length;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]);
				break;
			}
	}
	
	}

	
}
}
