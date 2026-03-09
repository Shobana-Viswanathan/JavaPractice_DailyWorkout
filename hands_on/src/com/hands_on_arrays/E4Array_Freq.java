/**
 * This program finds the frequency of each element in an array.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class E4Array_Freq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			int count = 1;
			int j;
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;
			}
			if (j < i)
				continue;
			for (j = i + 1; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			System.out.println(arr[i] + " occurs " + count + " times");
		}
		sc.close();
	}}





			

			

			

		



	
