/**
 * This program demonstrates how to sanitize sensitive information 
 * from a log entry.
 */
package com.hands_on_Strings;
import java.util.Scanner;
public class Strings_Q5 {
	public static String sanitizeLog(String log) {
		log = log.replaceAll("Password=[^;]*", "Password=************");
		log = log.replaceAll("\\b\\d+\\.\\d+\\.\\d+\\.\\d+\\b", "xxx.xxx.xxx.xxx");
		return log;}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String log = sc.nextLine();
		String result = sanitizeLog(log);
		System.out.println(result);
	}}





    




