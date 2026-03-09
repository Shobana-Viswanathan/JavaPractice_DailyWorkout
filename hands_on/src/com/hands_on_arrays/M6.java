/**
 * This program checks whether a given number is present
 * in an array of 25 elements.
 * It also counts how many times the number appears.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class M6 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[25];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number:");
		int n=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++) {
        	if(n==arr[i]) {
        		count++;
        	}
        }
        if(count>0) {
        	System.out.println("Number is present in the array: "+count);
        }
        else {
        	System.out.println("Number is not present in the array");
        }
	}
}

