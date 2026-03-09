package com.hands_on_ControlFlow;
import java.util.Scanner;
public class SalaryCalculation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Basic Salary: ");
	double basic = sc.nextDouble();
	double hra = 0, da = 0;
	if (basic <= 10000) {
		hra = basic * 0.20;
		da = basic * 0.80;
	} 
	else if (basic <= 20000) {
		hra = basic * 0.25;
		da = basic * 0.90;
	} 
	else {
		hra = basic * 0.30;
		da = basic * 0.95;
	}
	double gross = basic + hra + da;
	System.out.println("HRA = " + hra);
	System.out.println("DA = " + da);
	System.out.println("Gross Salary = " + gross);
	sc.close();
}}
	





	


