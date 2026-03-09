package com.assessment;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
    System.out.println("Enter a positive integer:");
    Scanner sc=new Scanner(System.in);
    int fact=0;
    int n=sc.nextInt();
    for(int i=1;i<n;i++) {
    	if(n%i==0) {
    		fact+=i;
    	}}
    	if(n==fact)
    	System.out.println("The given number is perfect ");
    	else
        	System.out.println("The given number is not perfect ");

    
   

	}

}
