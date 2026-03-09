package com.hands_on_ControlFlow;
import java.util.Scanner;
public class ArmStrong {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a 3-digit number: ");
	  int num = sc.nextInt();
	  int original = num;
	  int sum = 0;
	  while (num > 0) {
		  int digit = num % 10;
		  sum = sum + (digit * digit * digit);
		  num = num / 10;
	  }
	  if (sum == original) {
		  System.out.println("Armstrong Number");
	  } else {
		  System.out.println("Not an Armstrong Number");
	  }
	  sc.close();}}
	  







