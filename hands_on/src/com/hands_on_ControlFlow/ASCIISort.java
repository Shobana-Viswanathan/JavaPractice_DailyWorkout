package com.hands_on_ControlFlow;
import java.util.*;
public class ASCIISort {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter characters (without space): ");
	 String input = sc.nextLine();
	 char[] arr = input.toCharArray();  
	 Arrays.sort(arr);   
	 System.out.println("Sorted characters:");
	 for (char ch : arr) {
		 System.out.print(ch + " ");
	 }
	 sc.close();
}	 
}








