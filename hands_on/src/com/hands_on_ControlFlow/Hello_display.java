package com.hands_on_ControlFlow;
import java.util.*;
public class Hello_display {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int total = 0;
	        int num;
	        while (true) {

	            System.out.println("Enter a number:");
	            num = sc.nextInt();

	            if (num < 0) {
	                break;   
	            }

	            for (int i = 1; i <= num; i++) {
	                System.out.println("Hello");
	                total++;
	            }
	        }

	        System.out.println("Total Hello printed: " + total);

	}

}
