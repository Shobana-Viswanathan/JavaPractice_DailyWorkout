/*
 * This abstract code illustrate the method overriding
 */
package com.oops;
class Vechile{
	void run() {
		System.out.println("Vechile is running ");
	}
}
class Truck extends Vechile{
	void run() {
		System.out.println("Truck is running");
	}
}
public class OverRiding {

	public static void main(String[] args) {
   Vechile obj=new Vechile();
   obj.run();  //Vechile class run() method invoked
   Vechile  obj1=new Truck();
   obj1.run();     // Truck class run() method invoked
   
	}

}
