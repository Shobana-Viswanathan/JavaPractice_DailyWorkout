/*
 * Employee Payroll Management System
 * This program demonstrates OOP concepts like inheritance and method overriding
 * to calculate salaries for Permanent Employees, Contract Employees, and Interns
 * based on user choice.
 */
package hands_on_oops;
import java.util.Scanner;
class Employee11 {
	protected String empId;
	protected String empName;
	protected double baseSalary;
	public Employee11(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}
	double calculateSalary() {
		return baseSalary;
	}
	@Override
	public String toString() {
		return "Employee ID: " + empId +
				"\nEmployee Name: " + empName +
				"\nBase Salary: " + baseSalary;
	}
}
class PermanentEmployee extends Employee11 {
	private double bonus;
	public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}
	double calculateSalary() {
		return baseSalary + bonus;
	}
}
class ContractEmployee extends Employee11 {
	private double taxRate;
	private double serviceCharge;
	public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}
	double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}
}
class Intern extends Employee11 {
	private double stipend;
	public Intern(String empId, String empName, double stipend) {
		super(empId, empName, 0);
		this.stipend = stipend;
	}
	double calculateSalary() {
		return stipend;
	}
}
public class EmpPayrollManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("** Employee Payroll System **");
		System.out.println("1. Permanent Employee");
		System.out.println("2. Contract Employee");
		System.out.println("3. Intern");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Enter Employee ID: ");
		String id = sc.nextLine();
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		Employee11 emp = null;
		switch (choice) {
		case 1:
			System.out.print("Enter Base Salary: ");
			double base1 = sc.nextDouble();
			System.out.print("Enter Bonus: ");
			double bonus = sc.nextDouble();
			emp = new PermanentEmployee(id, name, base1, bonus);
			break;
		case 2:
			System.out.print("Enter Base Salary: ");
			double base2 = sc.nextDouble();
			System.out.print("Enter Tax Rate: ");
			double tax = sc.nextDouble();
			System.out.print("Enter Service Charge: ");
			double charge = sc.nextDouble();
			emp = new ContractEmployee(id, name, base2, tax, charge);
			break;
		case 3:
			System.out.print("Enter Stipend: ");
			double stipend = sc.nextDouble();
			emp = new Intern(id, name, stipend);
			break;
		default:
			System.out.println("Invalid Choice");
			return;
		}
		System.out.println("\nEmployee Details");
		System.out.println(emp);
		System.out.println("Final Salary: " + emp.calculateSalary());
		sc.close();
	}}		
		
		
		
		
		
			
			
			
			
			
			
			
			
		
		
	

























	