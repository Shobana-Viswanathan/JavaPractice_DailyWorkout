package com.exceptionhandling;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Employee_FileHandling {
	int code;
	String name;
	LocalDate dob;
	LocalDate doj;
	public Employee_FileHandling(int code, String name, LocalDate dob, LocalDate doj) {
		super();
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Code:");
		int code=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter Date of Birth (yyyy-mm-dd):");
		String d1=sc.nextLine();
		System.out.println("Enter Date of Appointment (yyyy-mm-dd):");
		String d2=sc.nextLine();
		try{
		if(code<=0)
		throw new Exception("Invalid Employee Code");
		LocalDate dob=LocalDate.parse(d1);
		LocalDate doj=LocalDate.parse(d2);
		if(!dob.isBefore(doj))
		throw new Exception("DOB must be before Date of Appointment");
		Employee_FileHandling e=new Employee_FileHandling(code,name,dob,doj);
		int exp=Period.between(doj,LocalDate.now()).getYears();
		System.out.println("Employee Code: "+e.code);
		System.out.println("Employee Name: "+e.name);
		System.out.println("Date of Birth: "+e.dob);
		System.out.println("Date of Appointment: "+e.doj);
		System.out.println("Experience: "+exp+" years");
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}}}
	




