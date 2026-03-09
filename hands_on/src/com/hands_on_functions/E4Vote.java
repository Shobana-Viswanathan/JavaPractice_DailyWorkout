/**
 * This program check whether the person is eligible to vote
 */
package com.hands_on_functions;
import java.util.Scanner;
public class E4Vote {
  static void vote(int age) {
	  if(age>18) {
		  System.out.println("Eligible to vote");
	  }
	  else {
		  System.out.println("Not Eligible");
	  }
  }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    vote(age);
    sc.close();
	}}


