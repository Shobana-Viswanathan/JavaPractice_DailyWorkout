package com.jdbc.JDBC_Practice;

import java.util.Scanner;

public class EmployeeCRUDProcedureDemo {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    EmployeeDAO dao=new EmployeeDAO();
    int choice;
    do {
    	System.out.println("\nPlease choose an option from the menu:");
    	System.out.println("1.Insert a new employee");
    	System.out.println("2.Display all Employees");
    	System.out.println("3.Update an employee's department");
    	System.out.println("4.Delete an employee");
    	System.out.println("5.Get employee details by ID");
    	System.out.println("0.Exit");
    	System.out.println("Enter the choice");
    	choice=sc.nextInt();
    	switch(choice) {

    	case 1:
    	    System.out.println("\n--- Insert Employee ---");
    	    System.out.println("Enter Employee ID: ");
    	    int id = sc.nextInt();
    	    sc.nextLine();
    	    System.out.println("Enter Employee Name: ");
    	    String name = sc.nextLine();
    	    System.out.println("Enter Employee Department: ");
    	    String dept = sc.nextLine();
    	    dao.insertEmployee(new Employee(id, name, dept));
    	    break;

    	case 2:
    	    System.out.println("\n--- Display All Employees ---");
    	    dao.displayEmployees();
    	    break;

    	case 3:
    	    System.out.println("\n--- Update Employee Department ---");
    	    System.out.println("Enter Employee ID: ");
    	    int updateId = sc.nextInt();
    	    sc.nextLine();
    	    System.out.println("Enter New Department: ");
    	    String newDept = sc.nextLine();
    	    dao.updateEmployee(updateId, newDept);
    	    break;

    	case 4:
    	    System.out.println("\n--- Delete Employee ---");
    	    System.out.println("Enter Employee ID: ");
    	    int deleteId = sc.nextInt();
    	    dao.deleteEmployee(deleteId);
    	    break;

    	case 5:
    	    System.out.println("\n--- Get Employee By ID ---");
    	    System.out.println("Enter Employee ID: ");
    	    int searchId = sc.nextInt();
    	    dao.getEmployeeById(searchId);
    	    break;

    	case 0:
    	    System.out.println("Exiting program...");
    	    break;

    	default:
    	    System.out.println("Invalid choice! Please try again.");
    	}}
    					
    while(choice!=0);
	

}}
