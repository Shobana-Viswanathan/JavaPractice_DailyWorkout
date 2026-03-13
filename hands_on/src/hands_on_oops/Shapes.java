/*
 * Shape Hierarchy Program
 * This program demonstrates abstraction and inheritance using an abstract class Shape.
 * Circle, Rectangle, and Square extend Shape and implement methods to calculate area and perimeter.
 */
package hands_on_oops;
abstract class Shape1 {
	protected String color = "red";
	protected boolean filled = true;
	public Shape1() {
	}
	public Shape1(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
	public String toString() {
		return "Shape[color=" + color + ", filled=" + filled + "]";
	}
}
class Circle extends Shape1 {
	protected double radius = 1.0;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	double getArea() {
		return Math.PI * radius * radius;
	}
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	public String toString() {
		return "Circle[" + super.toString() + ", radius=" + radius + "]";
	}
}
class Rectangle1 extends Shape1 {
	protected double width = 1.0;
	protected double length = 1.0;
	public Rectangle1() {
	
	}
		public Rectangle1(double width, double length) {
			this.width = width;
			this.length = length;}
		public Rectangle1(double width, double length, String color, boolean filled) {
			super(color, filled);
			this.width = width;
			this.length = length;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			this.length = length;
		}
		double getArea() {
			return width * length;
		}
		double getPerimeter() {
			return 2 * (width + length);
		}
		public String toString() {
			return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
		}
}
class Square1 extends Rectangle1 {
	public Square1() {
	}
	public Square1(double side) {
		super(side, side);
	}
	public Square1(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	public double getSide() {
		return width;
	}
	public void setSide(double side) {
		width = side;
		length = side;
	}
	public void setWidth(double side) {
		width = side;
		length = side;
	}
	public void setLength(double side) {
		width = side;
		length = side;
	}
	public String toString() {
		return "Square[" + super.toString() + "]";
	}
}
public class Shapes {
	public static void main(String[] args) {
		Circle c = new Circle(5, "blue", true);
		System.out.println(c);
		System.out.println("Area: " + c.getArea());
		System.out.println("Perimeter: " + c.getPerimeter());
		Rectangle1 r = new Rectangle1(4, 6, "green", true);
		System.out.println(r);
		System.out.println("Area: " + r.getArea());
		Square1 s = new Square1(4, "yellow", true);
		System.out.println(s);
		System.out.println("Area: " + s.getArea());
	}}
	
		
		
		
	
	
	
	
	
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	










