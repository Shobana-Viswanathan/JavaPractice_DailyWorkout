package com.hands_on_ControlFlow;
import java.util.Scanner;
public class SumOflDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Digit:");
		int num=sc.nextInt();
		int sum=0;
		while(num!=0) {
			int d=num%10;
			sum+=d;
			num/=10;
		}
		System.out.println("Sum: "+sum);

	}

}
