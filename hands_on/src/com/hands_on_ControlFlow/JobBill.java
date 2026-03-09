package com.hands_on_ControlFlow;
import java.util.Scanner;
public class JobBill {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter number of pages: ");
		 int pages = sc.nextInt();
		 System.out.print("Enter number of copies: ");
		 int copies = sc.nextInt();
		 int typingCost = pages * 3;
		 int printingCost;
		 if (copies == 1) {
			 printingCost = pages * 1;
		 } else {
			 printingCost = (pages * 1) + (pages * (copies - 1) * 3);
		 }
		 int totalBill = typingCost + printingCost;
		 System.out.println("Total Bill = Rs. " + totalBill);
		 sc.close();
	}}
		 
		 
		 
		 




	


