package com.hands_on_ControlFlow;
import java.util.Scanner;
public class CountCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.nextLine();
		int letters = 0, digits = 0, others = 0;
		for (int i = 0; i < str.length(); i++) {
			String ch = str.substring(i, i + 1);
			if (ch.matches("[a-zA-Z]")) {
				letters++;
			} 
			else if (ch.matches("[0-9]")) {
				digits++;
			} 
			else if (!ch.matches(" ")) {
				others++;
			}
		}
		System.out.println("Letters: " + letters +", Digits: " + digits +  ", Other Symbols: " + others);
		sc.close();}}











