/**
 * This program calculate the sum of odd and even numbers range from 1 to 1000
 */
package com.hands_on_functions;
import java.util.Scanner;
public class M1SumOfOdd_Even {
     static void sum( ) {
    	 int sumeven=0;
    	 int sumodd=0;
    	 for(int i=1;i<=1000;i++) {
    		 if(i%2==0) {
    			 sumeven+=i;
    		 }
    		 else {
    			 sumodd+=i;
    		 }
    	 }
    	 int abs_diff=sumodd-sumeven;
    	 System.out.println("The sum of odd numbers from 1 to 1000 is:"+sumodd);
    	 System.out.println("The sum of even numbers from 1 to 1000 is:"+sumeven);
    	 System.out.println("The absolute difference between the two sums is:"+abs_diff);
     }
	public static void main(String[] args) {
    sum();
	}

}
