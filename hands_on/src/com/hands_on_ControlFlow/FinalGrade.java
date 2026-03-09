/**
 * This program reads exercise and exam grades, calculates the final grade 
 * based on given conditions, and displays the class average before termination.
 */
package com.hands_on_ControlFlow;
import java.util.*;
public class FinalGrade {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  double total = 0; 
			int count = 0; 
			while (true) { 
				System.out.print("Enter exercise grade: "); 
				double exercise = sc.nextDouble(); 
				
				System.out.print("Enter exam grade: "); 
				double exam = sc.nextDouble(); 
				
				if (exercise == -1 || exam == -1) {
					break; 
				}
				if (exercise < 0 || exercise > 10 || exam < 0 || exam > 10) { 
					System.out.println("Grades must be between 0 and 10."); 
					continue; 
				} 
				double finalGrade; 
				
				if (exercise >= 5 && exam >= 5) { 
					finalGrade = (0.3 * exercise) + (0.7 * exam); 
				} 
				else {
					finalGrade = Math.min(exercise, exam); 
				} 
				System.out.println("Final grade = " + finalGrade); 
				total += finalGrade; 
				count++; 
			} 
			
			if (count > 0) { 
				double average = total / count; 
				System.out.println("Average grade = " + average); 
			}
			else { 
				System.out.println("No grades entered."); 
			} 
			sc.close();}}





	
