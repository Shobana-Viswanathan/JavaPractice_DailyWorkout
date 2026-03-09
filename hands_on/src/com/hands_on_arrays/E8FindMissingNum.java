/**
 * This program finds the missing number in an integer array 
 * The size of the array is given by the user.
 */

package com.hands_on_arrays;
import java.util.Scanner;
public class E8FindMissingNum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int freq[]=new int[256];
      for(int i=0;i<arr.length;i++) {
    	  arr[i]=sc.nextInt();
    	  freq[arr[i]]++;
      }
      System.out.println("Missing Numbers:");
      for(int i=1;i<=n;i++) {
    	  if(freq[i]==0) {
    		  System.out.println(i);
    	  }
      }
      
	}

}
