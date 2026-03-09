/**
 * This example demonstrates the usage of super in the method level
 */
package com.oops;
class ProjectLeader1{
	String leadname="Ram";
	int empid=1000;
	void displayData() {// base class method
		System.out.println("Project Leader Name:"+leadname);
		System.out.println("Project Leader Id:"+empid);
	}
}
class Programmer1 extends ProjectLeader1{
	String proname;
	int empid;
	void setData(String name,int id) {
		proname=name;
		empid=id;
	}
	void display() {
		System.out.println("Programmer name:"+proname);
		System.out.println("Programmer ID"+empid);
		super.displayData();
	}
}
public class SuperDemo {

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		obj.setData("Arun", 111);
		obj.displayData();
	}

}
