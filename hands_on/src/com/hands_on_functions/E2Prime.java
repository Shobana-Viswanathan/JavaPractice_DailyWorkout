/**
 * This program prints prime numbers between 1 and 100
 */
package com.hands_on_functions;
import java.util.Scanner;
public class E2Prime {
    static void findPrime() {
    	for(int i=1;i<=100;i++) {
    		int count=0;
    		for(int j=1;j<=100;j++) {
    			if(i%j==0) {
    				count++;
    			}
    		}
    		if(count==2) {
    			System.out.print(i+" ");
    		}
    	}
    }
	public static void main(String[] args) {
		System.out.println("Prime Numbers from 1 to 100: ");
		findPrime();
	}

}
