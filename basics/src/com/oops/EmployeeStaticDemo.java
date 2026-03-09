/**
 * This example demonstration static members
 */
package com.oops;

public class EmployeeStaticDemo {
   private static int tot=20;//static variable
   EmployeeStaticDemo(){
	   System.out.println("Current seat availability:"+tot);
   }
   public void DisplayTheatreScreen() {
	   System.out.println("Current seat availability:"+tot);

   }
   public void BookTicket(int nooftickets) {
	   System.out.println("No.of Seats Booked:"+nooftickets);
	   tot -= nooftickets;
   }
   
   
	public static void main(String[] args) {
     System.out.println("Screen Ticet Availability Status:"+tot);
     EmployeeStaticDemo TS1=new EmployeeStaticDemo();
     TS1.BookTicket(4);
     EmployeeStaticDemo TS2=new EmployeeStaticDemo();
     TS2.BookTicket(5);
     TS2.DisplayTheatreScreen();
	}

}
