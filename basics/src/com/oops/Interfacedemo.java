/**
 * The class which is implementing the interface,must define all the methods of interface.If it fails to define any method of the interface,the class becomes abstract class if one the methods is a default method,if needs not be redefined
 */

package com.oops;
interface Shape1{
	double Default_Val=1.0;
	double calculateArea();
	double calculatePerimeter();
	default String getDescription() {
		return "A shape with unspecified dimensions";
	}
}
	
	abstract class Circle1 implements Shape1{
		private double radius;

		public Circle1(double radius) {
			this.radius = radius;
		}
	    public Circle1() {
	    	this.radius=Default_Val;
	    }
      public double calculateArea() {
			return Math.PI*radius*radius;
		}
	    
	    public double calculatePerimeter() {
	    	return 2*Math.PI*radius;
	    }
	    public String getDescription() {
	    	return "A circle with radius"+radius;
	    }
	}	
	
	class Rectangle1 implements Shape1{
		private double length;
		private double width;
		public Rectangle1(double length,double width) {
			this.length=length;
			this.width=width;
		}
		public Rectangle1() {
			this.length=Default_Val;
			this.width=Default_Val;
		}
		public double calculateArea() {
			return length*width;
		}
		public double calculatePerimeter() {
			return 2*(length*width);
		}
		public String getDescription() {
	    	return "A rectangle with length "+length+"and width"+width;
	    }
		
	}
		
public class Interfacedemo {

	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1(10,20);
		//Circle c=new Cirlce(50);

	        System.out.println(r.getDescription());
	        System.out.println("Area: " + r.calculateArea());
	        System.out.println("Perimeter: " + r.calculatePerimeter());
	
	}

}
