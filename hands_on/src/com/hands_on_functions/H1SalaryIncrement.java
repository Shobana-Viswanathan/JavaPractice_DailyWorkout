/**
 *  This program calculates the incremented salary of an employee
 * based on their performance appraisal rating.
 */
package com.hands_on_functions;
import java.util.Scanner;
public class H1SalaryIncrement {
    static void findinc(double salary,double rating) {
        double inc=0;
        if (salary <= 0 || rating < 1 || rating > 10) {
            System.out.println("Invalid Input");
           return;
        }
    	if(rating>=1 && rating<=4) {
    		 inc= salary*0.10;
    	}
    	else if(rating>4.1 && rating<=7) {
    		inc=salary*0.25;
    	}
    	else if(rating>7.1 && rating<=10) {
    		inc=salary*0.30;
    	}
    	System.out.println(salary+inc);
    }
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Salary:");
    int salary=sc.nextInt();
    System.out.println("Enter the Performance appraisal rating");
    int rating=sc.nextInt();
    findinc(salary,rating);
    sc.close();
	}

}
