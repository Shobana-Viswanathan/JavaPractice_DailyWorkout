/**ThisExample demonstrates how to access class members using object. */
package com.oops;
public class Employee {
	int empId;
	String empName;
	void setEmployeeDetail(int id,String name) {
	empId= id;
	empName= name;
	}
	void getEmployeeDetail () {
	System.out.println("Employee id : "+empId);
	System.out.println("Employee name : "+empName);
	}
	public static void main(String[] args) {
		Employee Emp1 = new Employee();       //First Object Creation
		Employee Emp2 = new Employee();       //Second Object Creation
		Emp1.setEmployeeDetail(1001, "RAM");      
		Emp2.setEmployeeDetail(1002, "RAJ");
		Emp1.getEmployeeDetail();
		Emp2.getEmployeeDetail();}
}
