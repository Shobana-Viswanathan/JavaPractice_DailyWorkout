/**
 * This program checks whether N friends can share their chocolates equally.
 * If the total number of chocolates is divisible by N, it prints "Yes", otherwise "No".
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class H1 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		if(sum%n==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
