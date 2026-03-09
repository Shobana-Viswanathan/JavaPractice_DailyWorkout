/*
 * This program calculates the new salary after applying hike percentage
 */
package com.hands_on_functions;
import java.util.Scanner;
public class E3Salary {
	static void calculateNewSalary(double oldSalary, double hike) {
		double newSalary = oldSalary + (oldSalary * hike / 100);
		System.out.println("New Salary after hike: " + newSalary);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary per month: ");
		double oldSalary = sc.nextDouble();
		System.out.print("Enter the hike percentage: ");
		double hike = sc.nextDouble();
		calculateNewSalary(oldSalary, hike); 
		sc.close();}}






	