/*
 * 
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class H3Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int n = 0;
        System.out.println("Enter numbers (enter negative to stop):");
        while(true) {
        	int x = sc.nextInt();
        	if(x < 0)
        		break;
        	arr[n] = x;
        	n++;
        }
        for(int i = 0; i < n; i++) {
        	if(arr[i]% 7==0&& arr[i] % 8 == 0) {
        		arr[i] = -6;
        	}
        	else if(arr[i]%7 == 0) {
        		arr[i] =-2;
        	}
        	else if(arr[i]% 8 == 0) {
        		arr[i] =-9;
        	}
        }
        System.out.println("Output:");
        for(int i =0;i<n;i++) {
        	System.out.println(arr[i]);
        }}}





