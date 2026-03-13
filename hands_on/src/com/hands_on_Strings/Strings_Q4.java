/*
 * This class demonstrates the encrypt a message  
 */
package com.hands_on_Strings;
import java.util.Scanner;
public class Strings_Q4 {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     String str = sc.nextLine();
     StringBuilder sb = new StringBuilder();
     for(int i = 0; i < str.length(); i++) {
    	 char ch = str.charAt(i);
    	 if(ch >= 'A' && ch <= 'Z') {
    		 sb.append((char)((ch - 'A' + 3) % 26 + 'A'));
    	 }
    	 else if(ch >= 'a' && ch <= 'z') {
    		 sb.append((char)((ch - 'a' + 3) % 26 + 'a'));
    	 }
    	 else if(ch >= '0' && ch <= '9') {
    		 sb.append(ch);
    	 }
    	 else if(ch == ' ') {
    		 sb.append('_');
    	 }
    	 else {
    		 sb.append(ch);
    	 }
     }
     System.out.println(sb.toString());
}}
    	 
    	 








