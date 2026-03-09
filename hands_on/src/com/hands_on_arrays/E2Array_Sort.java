/**
 * The E2Array_Sort class is used to sort the elements of an array 
 * in ascending order and display the sorted array.
 */
package com.hands_on_arrays;
import java.util.*;
public class E2Array_Sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length-i-1;j++)
			{	
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println("The sorted Array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}}}



	


