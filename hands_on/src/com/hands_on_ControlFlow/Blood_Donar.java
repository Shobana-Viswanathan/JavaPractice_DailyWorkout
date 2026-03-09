package com.hands_on_ControlFlow;
import java.util.Scanner;
public class Blood_Donar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.print("Enter age: ");
		   int age = sc.nextInt();
          System.out.print("Enter weight: ");
	        int weight = sc.nextInt();

	        if (age > 18 && age < 55 && weight > 45) {
	            System.out.println("Eligible for blood donation");
	        } else {
	            System.out.println("Not eligible for blood donation");
	        }

	        sc.close();

	}

}
