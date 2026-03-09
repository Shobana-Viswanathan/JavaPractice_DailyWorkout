/**
 * * This program finds the department with the highest placement
 */
package com.hands_on_functions;
import java.util.Scanner;
public class H2Placements {
 static void findmax(int cs,int ec,int me) {
	 if(cs < 0 || ec < 0 || me < 0)
	 System.out.println("Input is Invalid");
	 else if(cs == ec && ec == me) 
		 System.out.println("None of the department has got the highest placement");
	 else if((cs>ec)&&(cs>me))
			 System.out.println("Highest placement CS");
	 else if((ec>cs)&&(ec>me))
			 System.out.println("Highest placement EC");
	 else
			 System.out.println("Highest placement ME");
 }
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of students placed in CS:");
   int cs=sc.nextInt();
   System.out.println("Enter the no of students placed in EC:");
   int ec=sc.nextInt();
   System.out.println("Enter the no of students placed in ME:");
   int me=sc.nextInt();
   findmax(cs,ec,me);
   sc.close();

	}

}
