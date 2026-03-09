/**
 * This program prints all prime numbers in the interval [x, y]
 * using a separate function.
 * If x > y, it prints "Provide valid input".
 */
package com.hands_on_functions;
import java.util.Scanner;
public class M2Prime {
	static void prime(int first,int last) {
		   if (first > last) {
	            System.out.println("Provide valid input");
	            return;
	        }
		for(int i=first;i<=last;i++) {
			int c=0;
			if(i>1) {
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					c++;
				}
				
				}
			if(c==2)
			System.out.print(i+" ");
		}
	}}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int last=sc.nextInt();
		prime(first,last);
		sc.close();
}}
		
		
        

