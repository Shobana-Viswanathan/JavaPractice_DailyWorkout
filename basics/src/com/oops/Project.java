/**
 * This example demonstration the usage of super in variable level
 */
package com.oops;
class ProjectLeader{
	String leadname="Ram";
	int empid=101;
	
}
class Programmer extends ProjectLeader{// child class
	String progname;
	int id;
	void setData(String name,int id) {// derived class
		progname=name;
		empid=id;
	}
	void displayData() {
		System.out.println("Programmer Name: "+ progname);
		System.out.println("Programmer Id: "+ empid);
		System.out.println("Project Leader Name: "+ super.leadname);
		System.out.println("Project Leader Id: "+ super.empid); 
	}
	
}

public class Project {
	public static void main(String[] args) {

		Programmer obj = new Programmer();
		obj.setData("Arun", 111);
		obj.displayData();
	}

}
