/*
 * This program illustrates the use of 'this' keyword for all cases
 */
package com.oops;

 class Employee1{
 int id;
 String name;
 double salary;
 //1.Using 'this' to refer to instance variables
 Employee1(int id,String name,double salary){
	  this.id=id;//Refers to instance variables
	  this.name=name;
	  this.salary=salary;
	  System.out.println("Employee record created successfully");
 }
 //2.Using 'this()' to call another constructor(Constructor chaining)
 Employee1(){
	 this(101,"Default Employee",30000);// calls parameterized constructor
	 System.out.println("Default constructor called-initilaized with default data.\n");
 }
 //3.Using 'this' to call another method in the same class
 void registerEmployee(){
	 System.out.println("Registering Employee..");
	 this.displayDetails();//Calls another method
 }
void displayDetails() {
	System.out.println("Employee ID"+id);
	System.out.println("Employee Name:"+name);
	System.out.println("Employee Salary:"+salary);
}
//4.Using 'this' to pass current object
void sendForProcessing() {
	HRDepartment hr=new HRDepartment();
	hr.processEmployee(this);//pass current object
}
//5.Using 'this' to return current object (Method Chaining)
Employee1 updateSalary(double hikePercentage) {
	this.salary=salary+(salary*hikePercentage/100);
	return this;//Allows chaining
}
Employee1 updateName(String newName) {
	this.name=newName;
	return this;
}}
//Helper class representing another department
 class HRDepartment {
	void processEmployee(Employee1 e) {
	System.out.println("HR Department Processing Employee..");	
	System.out.println("Processed Employee: "+e.name+"with salary"+e.salary+"\n");
	}}
 public class EmployeeThisKeywordDemo {
	 public static void main(String[]args) {
		 //calls default constructor -> internally calls parameterized constructor
		 Employee1 emp=new Employee1();
		 // 1 and 2 demonstrated through constructor chaining
		 emp.registerEmployee();// calling method using 'this'
		 //4.Passing current object to another class
		 emp.sendForProcessing();
		 //5.Method chaining to update details
		 System.out.println("--Updating Employee Details--");
		 emp.updateName("Shobana").updateSalary(15.5).displayDetails();
		 //passing again after update
		 emp.sendForProcessing();
	 }
 }
 

 

