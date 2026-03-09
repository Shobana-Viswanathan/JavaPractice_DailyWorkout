package com.hands_on_ControlFlow;
import java.util.Scanner;
public class Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter hours: ");
		int hr = sc.nextInt();
		System.out.print("Enter minutes: ");
		int min = sc.nextInt();
		int bill;
		if (hr > 7) {
			System.out.println("Maximum browsing limit is 7 hours");
		}
		else if (hr == 5 && min == 0) {
			bill = 200;
			System.out.println("Total Bill = Rs. " + bill);
		}
		else {
			bill = (hr * 50) + min;
			System.out.println("Total Bill = Rs. " + bill);
		}
		sc.close();}}
		
		





	


