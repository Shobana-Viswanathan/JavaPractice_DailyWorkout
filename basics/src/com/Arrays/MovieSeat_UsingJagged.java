package com.Arrays;
import java.util.*;
public class MovieSeat_UsingJagged {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);

     System.out.println("-- MOVIE SEAT ARRANGEMENT --");
     System.out.print("Enter number of seat categories: ");
     int rows = sc.nextInt();
     String[][] seatType = new String[rows][];
     for (int i = 0; i < rows; i++) {
    	 if (i == 0)
    		 System.out.println("-------- VIP SEATS --------");
    	 else if (i == 1)
    		 System.out.println("------ PREMIUM SEATS ------");
    	 else
    		 System.out.println("------ REGULAR SEATS ------");
    	 
    	 System.out.print("Enter number of seats in this category: ");
    	 int cols = sc.nextInt();
    	 seatType[i] = new String[cols];
    	 for (int j = 0; j < cols; j++) {
    		 System.out.print("Enter seat type (A/B) for seat " + (j + 1) + ": ");
    		 seatType[i][j] = sc.next();
    	 }
     }
     int acount = 0, bcount = 0;
     for (int i = 0; i < seatType.length; i++) {
    	 for (int j = 0; j < seatType[i].length; j++) {
    		 
    		 if (seatType[i][j].equalsIgnoreCase("A"))
    			 acount++;
    		 else if (seatType[i][j].equalsIgnoreCase("B"))
    			 bcount++;
    	 }
     }
     System.out.println("\n--- SEAT SUMMARY ---");
     System.out.println("Total A Seats: " + acount);
     System.out.println("Total B Seats: " + bcount);
     sc.close();}}
    	 

    	 
   

     

    






	
	
	
	
	
	


