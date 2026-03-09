/**
 * This program demonstrates method overloading using an Employee class.
 * It increases employee salary using percentage and percentage with bonus.
 * The updated employee details are displayed after each salary update.
 */
package com.assessment2;
class Employee{
	int employeeId;
	String name;
	String designation;
	double salary;
	public Employee(int employeeId, String name, String designation, double salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public void displayInfo() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Name : " + name);
		System.out.println("Designation : " + designation);
		System.out.println("Salary : " + salary);
	}
	public void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100);
	}
	
	public void increaseSalary(double percentage,double bonus) {
		salary = salary + (salary * percentage / 100) + bonus;
	}
}
public class Employee_Salary {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"John","Manager",50000);
		
		System.out.println("EMPLOYEE DETAILS");
		e1.displayInfo();
		
		System.out.println("\nAfter 10% Salary Increment:");
		e1.increaseSalary(10);
		e1.displayInfo();
		
		System.out.println("\nAfter 5% Increment + Bonus:");
		e1.increaseSalary(5,2000);
		e1.displayInfo();
	}
}




	
		

