package com.demo;
import java.util.Scanner;
public class SimpleIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean seatAvailable = true; //Seat Available Status
		Scanner input = new Scanner(System.in); //Scanner class object creation
		System.out.println("Enter the Seat Number : ");
		String SeatNumber = input.next(); //get Seat Number from User
		if(seatAvailable){ //Check the availability of seat
		System.out.println("Your have booked the seat number : "+SeatNumber);
		}
		input.close();
		

	}

}
