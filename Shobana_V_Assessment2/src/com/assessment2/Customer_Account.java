/**
 * Banking Application Program
 * This program demonstrates a simple banking system using Customer and Account classes.
 * It allows the user to withdraw money, deposit money, check account balance,
 * and exit the application using a menu-driven approach.
 */
package com.assessment2;
import java.util.*;
class Customer{
	private int id;
	private String name;
	private char gender;
	public Customer(int id, String name, char gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return name + "(" + id + ")";
	}
}
class Account{
	private int id;
	private Customer customer;
	private double balance = 0.0;
	public Account(int id, Customer customer) {
		this.id = id;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public double getBalance() {
		return balance;
	}
	@Override
	public String toString() {
		return customer.toString() + " balance=$" + String.format("%.2f", balance);
	}
	public Account deposit(double amt) {
		balance += amt;
		return this;
	}
	public Account withdraw(double amt) {
		if(balance >= amt){
			balance -= amt;
			System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY!!");
		}
		else{
			System.out.println("AMOUNT WITHDRAWN EXCEEDS THE CURRENT BALANCE!");
		}
		return this;
	}
}
public class Customer_Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER ACCOUNT_ID: ");
		int accId = sc.nextInt();
		System.out.print("ENTER CUSTOMER_ID: ");
		int custId = sc.nextInt();
		sc.nextLine();
		System.out.print("ENTER CUSTOMER_NAME: ");
		String name = sc.nextLine();
		System.out.print("ENTER CUSTOMER_GENDER: ");
		char gender = sc.next().charAt(0);
		Customer c = new Customer(custId, name, gender);
		Account a = new Account(accId, c);
		System.out.println("\nACCOUNT DETAILS");
		System.out.println("ACCOUNT_ID " + accId);
		System.out.println("CUSTOMER_ID " + custId);
		System.out.println("CUSTOMER_NAME : " + name);
		System.out.println("CUSTOMER_GENDER : " + gender);
		System.out.println("ACCOUNT_BALANCE : " + a.getBalance());
		int option;
		do {
			System.out.println("\nPLEASE SELECT ONE OPTION FROM BELOW");
			System.out.println("1.WITHDRAW");
			System.out.println("2.DEPOSIT");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.EXIT");
			System.out.print("OPTION: ");
			option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.print("ENTER AMOUNT TO WITHDRAW: ");
				double wamt = sc.nextDouble();
				a.withdraw(wamt);
				break;
			case 2:
				System.out.print("ENTER AMOUNT TO DEPOSIT: ");
				double damt = sc.nextDouble();
				a.deposit(damt);
				System.out.println("AMOUNT DEPOSITED SUCCESSFULLY!!");
				break;
			case 3:
				System.out.println("CURRENT BALANCE: " + a.getBalance());
				break;
			case 4:
				System.out.println("THANK YOU FOR BANKING WITH US!!");
				break;
				
			default:
				System.out.println("INVALID OPTION");
			}
			
		} while(option != 4);
		sc.close();
	}}
		
		
		
		
		
		
		
		
			
			
			
				
				
				
















	
