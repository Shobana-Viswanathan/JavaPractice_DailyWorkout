package com.assessment;
import java.util.Scanner;

public class LuckyDraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("No of Participants: ");
		int n = sc.nextInt();
		int[] token = new int[n];
		System.out.print("Token Number for " + n + " participants: ");
		for (int i = 0; i < n; i++) {
			token[i] = sc.nextInt();
			if (!(token[i] >= 1000 && token[i] <= 9999)) {
				System.out.println("Invalid Input!!");
				return;
			}
		}
		int first = 0, second = 0, third = 0;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			int num = token[i];
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			
			while (sum > 9) {
				int tempSum = 0;
				int temp = sum;
				
				while (temp > 0) {
					tempSum += temp % 10;
					temp /= 10;
				}
				sum = tempSum;
			}
			
			if (sum == 7)
				first = token[i];
			else if (sum == 5)
				second = token[i];
			else if (sum == 3)
				third = token[i];
		}
		
		System.out.println("First Prize is to token: " + first);
		System.out.println("Second Prize is to token: " + second);
		System.out.println("Third Prize is to token: " + third);
		
		sc.close();
	}
}