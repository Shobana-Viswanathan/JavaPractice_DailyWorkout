
package com.hands_on_arrays;
import java.util.Scanner;
public class E3Max_min {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
        	arr[i] = sc.nextInt();
        	if (arr[i] > max) {
        		max = arr[i];
        	}
        	if (arr[i] < min ) {
        		min = arr[i];
        	}
        }
        System.out.println("The min element is: "+min);
        System.out.println("The max element is: "+ max);}}
        	


       

        

	