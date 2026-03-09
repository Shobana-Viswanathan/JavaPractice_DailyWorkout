package com.hands_on_ControlFlow;
import java.util.Scanner;
public class DiscountBill {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter price: ");
		  double price = sc.nextDouble();
		  System.out.print("Enter quantity: ");
		  int quantity = sc.nextInt();
		  double purchaseAmount = price * quantity;
		  double discount;
		  if (purchaseAmount > 1000) {
			  discount = purchaseAmount * 0.10;
		  } else {
			  discount = purchaseAmount * 0.05;
		  }
		  double paidAmount = purchaseAmount - discount;
		  System.out.println("Purchase Amount = " + purchaseAmount);
		  System.out.println("Discount Amount = " + discount);
		  System.out.println("Paid Amount = " + paidAmount);
		  sc.close();}}
		  


		  




	


