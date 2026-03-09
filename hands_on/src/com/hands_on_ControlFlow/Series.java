package com.hands_on_ControlFlow;
import java.util.Scanner;
public class Series {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of i:");
       int i = sc.nextInt();
       int sum = 0;
       int num = 1;
       do {
           sum = sum + num;
           num++;
       } while (num <= i);
   System.out.println("Sum = " + sum);
}
}
