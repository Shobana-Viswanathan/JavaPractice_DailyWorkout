/**
 * This program demonstrates runtime polymorphism using abstract class
 */
package com.oops;

abstract class Shape{
	void draw() {// concrete method
		System.out.println("Drawing...");
	}
	abstract void area();//abstract method
	abstract void perimeter();//abstract method
}
 class Rectangle extends Shape{
	private int length,breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		System.out.println(length*breadth);
	}
	void perimeter() {
		System.out.println(2*length*breadth);
	}
}
 class Square extends Shape{
	 private int side;

	public Square(int side) {
		this.side = side;
	}
		void area() {
			System.out.println(side*side);
		}
	 void perimeter() {
		 System.out.println(4*side);
	 }
 }
 class Circle extends Shape{
	 private int radius;
     final double PI=3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
		void area() {
			System.out.println(PI*radius*radius);
		}
		void perimeter() {
			System.out.println(2*PI*radius);
		}
 }
	 

public class Abstractdemo {

	public static void main(String[] args) {
    Shape s;
    s=new Rectangle(10,20);
    System.out.println("About  Rectangle");
    s.draw();
    s.area();
    s.perimeter();
    s=new Circle(20);
    System.out.println("About circle");
    s.draw();
    s.area();
    s.perimeter();
	}

}
