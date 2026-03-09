package com.demo;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		
		String username = "Sarvesh",password = "sarvesh@123",usernameentered=null,passwordentered;
		boolean seatAvailable = true;
		String seatNumber;
		Scanner input = new Scanner(System.in); //Scanner class object creation
		System.out.println("Enter the Username : ");
		username = input.next(); //getting the username
		System.out.println("Enter the Password : ");
		password = input.next(); 
		if (usernameentered.equals(username) && password.equals(password)) { //validate the user login
		System.out.println("You have logged in and you can book a ticket now");
		System.out.println("Enter the Seat Number : ");
		seatNumber = input.next(); // get the seat number from the user
		if (seatAvailable) { // check for seat availability status
		System.out.println("Seat Number "+seatNumber+" you have chosen is available");
		} else{
		System.out.println("Your expected Seat Number "+seatNumber+" is not available");
		}
		} else{
		System.out.println("You have to login for booking the ticket");
		} 

	}

}
