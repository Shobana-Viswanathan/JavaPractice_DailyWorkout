/*
 * This class demonstrates the removing duplicate characters from string
 */
package com.hands_on_Strings;
import java.util.*;
public class Strings_Q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int freq[]=new int  [256];
    for(int i=0;i<str.length();i++) {
    	char ch=str.charAt(i);
    	if(freq[ch]==0) {
    		System.out.print(ch);
    		freq[ch]++;
    	}
    }
    }}
