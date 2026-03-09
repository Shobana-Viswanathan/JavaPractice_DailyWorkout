/**
 * This program checks whether the given number is a perfect factorial
 */
package com.hands_on_ControlFlow;
import java.util.Scanner;
public class PerfectFactorial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        long num = sc.nextLong();
	        if (num <= 0) {
	        	System.out.println("Invalid Input");
	        	return;
	        }
	        long fact = 1;
	        int i = 1;
	        while (fact < num) {
	        	i++;
	        	fact = fact * i;
	        }
	        if (fact == num) {
	        	System.out.println(i);
	        } else {
	        	System.out.println("Sorry. The given number is not a perfect factorial");
	        }
	        sc.close();}}

	        


	       

	      



