package com.hands_on_ControlFlow;
import java.util.Scanner;
public class Divisor {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int  n=sc.nextInt();
		if(n%7==0) {
			System.out.println("The given number is divisor of 7");
		}
		else {
			System.out.println("No the given number is not divisor of 7");
		}

	}

}
