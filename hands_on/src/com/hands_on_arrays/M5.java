/**
 * This program finds the frequency of each element in an array.
 */
package com.hands_on_arrays;
import java.util.Scanner;
public class M5 {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter number of elements: ");
      int[] arr = new int[] {10,10,10,10,20,20,20,20,40,40,50,50,30 };
	  
	  for (int i = 0; i < arr.length; i++) {
		  
		  int count = 0;
		  
		  for (int j = 0; j < arr.length; j++) {
			  if (arr[i] == arr[j]) {
				  count++;
			  }
		  }
		  int alreadyPrinted = 0;
		  for (int k = 0; k < i; k++) {
			  if (arr[i] == arr[k]) {
				  alreadyPrinted = 1;
				  break;
			  }
		  }
		  if (alreadyPrinted == 0) {
			  System.out.println(arr[i] + " occurs " + count + " times");
		  }
	  }
	  sc.close();}}









	


