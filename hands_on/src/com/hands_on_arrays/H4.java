/**
 * This program merges three arrays of different sizes
 * and sorts them in ascending order.
 */
package com.hands_on_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class H4 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		int o=sc.nextInt();
		int arr3[]=new int[o];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=sc.nextInt();
		}
		int[] merged = new int[m + n + o];
		int index = 0;
		for (int i = 0; i < m; i++)
			merged[index++] = arr1[i];
		for (int i = 0; i < n; i++)
			merged[index++] = arr2[i];
		for (int i = 0; i < o; i++)
			merged[index++] = arr3[i];
		for (int i = 0; i < merged.length - 1; i++) {
			for (int j = 0; j < merged.length - 1 - i; j++) {
				if (merged[j] > merged[j + 1]) {
					int temp = merged[j];
					merged[j] = merged[j + 1];
					merged[j + 1] = temp;
				}}}
		for (int i = 0; i < merged.length; i++) {
			System.out.print(merged[i] + " ");
		}
		sc.close();
}
}
		
		
		
	






              

        





