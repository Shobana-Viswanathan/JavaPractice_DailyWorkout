package com.exceptionhandling;
import java.util.Scanner;
public class Username_Password{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter stored username:");
	String su=sc.nextLine();
	System.out.println("Enter stored password:");
	String sp=sc.nextLine();
	System.out.println("Enter username:");
	String u=sc.nextLine();
	System.out.println("Enter password:");
	String p=sc.nextLine();
	try{
	if(u.length()<6||u.length()>30||!u.matches("^[A-Za-z][A-Za-z0-9_]*$"))
	throw new Exception("Invalid Username");
	if(p.length()<8||!p.matches(".*[a-z].*")||!p.matches(".*[A-Z].*")||!p.matches(".*[0-9].*")||!p.matches(".*[!@#$%^&*()\\-+].*"))
	throw new Exception("Invalid Password");
	if(u.equals(su)&&p.equals(sp))
	System.out.println("Welcome "+u);
	else
	System.out.println("Invalid username or password");
	}
	catch(Exception e){
	System.out.println(e.getMessage());
	}}}
