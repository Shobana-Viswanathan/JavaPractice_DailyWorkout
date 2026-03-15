/*
 * This program is to check whether the email is valid or invalid
 */

package com.hands_on_Strings;
import java.util.Scanner;
public class String_Q3 {
	public static boolean Validatemail(String mail) {
		String regex = "^[a-z][a-z0-9._-]*@[a-z0-9-]+(\\.[a-z0-9-]+)+$";
		return mail.matches(regex);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mail Id");
		String mail = sc.nextLine();
		if(Validatemail(mail)) {
			System.out.println("Valid email");
		}
		else {
			System.out.println("Invalid email");
		}
	}

}
