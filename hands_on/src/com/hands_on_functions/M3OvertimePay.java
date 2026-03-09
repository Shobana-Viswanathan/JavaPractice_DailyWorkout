/**
 * This program calculates overtime pay for 5 employees.
 * Overtime is paid at Rs.15 per hour for hours worked beyond 40.
 */
package com.hands_on_functions;
import java.util.Scanner;
public class M3OvertimePay {
   static double overtime(int hours) {
	   if(hours>40) {
		   int overhour=hours - 40;
		   return overhour*15.0;
	   }
	   else {
		   return 0;
	   }
   }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] h=new int[5];
    for(int i=0;i<5;i++) {
    	 h[i]=sc.nextInt();
    }
    for (int i = 0; i < 5; i++) {
        double pay = overtime(h[i]);
        System.out.println("Employee " + (i + 1) + 
                           " Overtime Pay: Rs." + pay);
    }
    sc.close();
	}
}
    	

