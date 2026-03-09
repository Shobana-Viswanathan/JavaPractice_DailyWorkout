/**
 * The Odd_Even_Array class is used to print the odd and even numbers in separate arrays
 */

package com.hands_on_arrays;
import java.util.Scanner;
public class E1Odd_Even_Array {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int even=0,odd=0;
    int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]%2==0) {
        even+=arr[i];
    	}
    	else {
    		odd+=arr[i];
    	}
    }
    System.out.println(even);
    System.out.println(odd);
  
	}

}
