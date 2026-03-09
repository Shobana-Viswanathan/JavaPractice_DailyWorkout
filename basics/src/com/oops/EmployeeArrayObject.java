/** This example demonstratesthe array of objects. */
package com.oops;
public class EmployeeArrayObject {
	int empId;
	String empName;    
	void setEmployeeDetail(int id,String name){
	empId= id;
	empName= name;
	}
	void getEmployeeDetail (){
	System.out.println("Employee id : "+empId);
	System.out.println("Employee name : "+empName);
	}


	public static void main(String[] args) {
		Employee Emp[] = new Employee[2];
		for(int i=0;i<2;i++) {   
		Emp[i] = new Employee();
		}
		System.out.println("-----Employee 1 Detail-----");
		Emp[0].setEmployeeDetail(1001, "AMUDHAN");
		Emp[0].getEmployeeDetail();
		System.out.println("-----Employee 2 Detail-----");
		Emp[1].setEmployeeDetail(1002, "RAJ");
		Emp[1].getEmployeeDetail();
	}
}

