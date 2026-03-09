package com.demo;
import java.util.Scanner;
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Type of seats Available\n REGULAR \n PREMIUM\nEXECUTIVE \n VIP \n choose any one of theoption : ");
		Scanner input = new Scanner(System.in); //Scanner class object creation
		String seattype = input.next(); // get Seat Number from User
		if (seattype.equals("REGULAR")) { //Display detail for REGULAR type
		System.out.println("You have selected Executive Seat and cost is Rs.80");
		} 
		else if (seattype.equals("PREMIUM")) { //Display detail for PREMIUM type
		System.out.println("You have selected Premium Seat and cost is Rs.100");
		}
		else if (seattype.equals("EXECUTIVE")) { //Display detail for EXECUTIVE type
		System.out.println("You have selected Regular Seat and cost is Rs.120");
		} else if (seattype.equals("VIP")) { //Display detail for VIP type
		System.out.println("You have selected VIP Seat and cost is Rs.150");
		} else {
		System.out.println("You have not selected any type");
		}
		input.close();
		
		

	}

}
