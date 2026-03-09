package com.hands_on_ControlFlow;
import java.util.*;
public class Calendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month number (1-12): ");
		int month = sc.nextInt();
		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
			return;
		}
		System.out.print("Enter starting day (1=Mon ... 7=Sun): ");
		int startDay = sc.nextInt();
		int days = 31;   
		if (month == 2) {
			System.out.print("Enter days in February (28 or 29): ");
			days = sc.nextInt();
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		}
		System.out.println("Mon Tue Wed Thu Fri Sat Sun");
		for (int i = 1; i < startDay; i++) {
			System.out.print("    ");
		}
		for (int i = 1; i <= days; i++) {
			System.out.printf("%3d ", i);

			if ((i + startDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
		sc.close();
	}}	
















