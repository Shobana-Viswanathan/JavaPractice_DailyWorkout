package com.hands_on_ControlFlow;
import java.util.Scanner;
public class Discount_Calculation {
        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter quantity: ");
		int quantity = sc.nextInt();
		System.out.print("Enter price per item: ");
		double price = sc.nextDouble();
		double total = quantity * price;
		double discount = 0;
		if (quantity > 500) {
			discount = total * 15 / 100; 
		}
		double finalAmount = total - discount;
		System.out.println("Total Amount: " + total);
		System.out.println("Discount: " + discount);
		System.out.println("Final Expense: " + finalAmount);
		sc.close();
        }
}
		
		







