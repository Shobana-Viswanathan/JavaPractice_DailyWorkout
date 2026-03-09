/**
 * This program demonstrates abstraction and polymorphism using shapes.
 * Different shapes compute their own area and the Paint class calculates
 * the amount of paint required based on surface area and coverage.
 */
package hands_on_oops;
abstract class Shape{
	String shapeName;

	public Shape(String shapeName){
		this.shapeName = shapeName;
	}

	public abstract double area();

	public String toString(){
		return shapeName;
	}
}

class Sphere extends Shape{
	double radius;

	public Sphere(double radius){
		super("Sphere");
		this.radius = radius;
	}

	public double area(){
		return 4 * Math.PI * radius * radius;
	}

	public String toString(){
		return super.toString() + " (radius = " + radius + ")";
	}
}

class Rectangle extends Shape{
	double length;
	double width;

	public Rectangle(double length,double width){
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	public double area(){
		return length * width;
	}

	public String toString(){
		return super.toString() + " (length = " + length + ", width = " + width + ")";
	}
}

class Cylinder extends Shape{
	double radius;
	double height;

	public Cylinder(double radius,double height){
		super("Cylinder");
		this.radius = radius;
		this.height = height;
	}

	public double area(){
		return Math.PI * radius * radius * height;
	}

	public String toString(){
		return super.toString() + " (radius = " + radius + ", height = " + height + ")";
	}
}

class Paint{
	double coverage;

	public Paint(double coverage){
		this.coverage = coverage;
	}

	public double amount(Shape s){
		System.out.println("Computing amount for " + s);
		return s.area() / coverage;
	}
}

public class PaintShapes {

	public static void main(String[] args) {
		Paint paint = new Paint(350);

		Rectangle deck = new Rectangle(20,35);
		Sphere bigBall = new Sphere(15);
		Cylinder tank = new Cylinder(10,30);

		double deckAmt = paint.amount(deck);
		double ballAmt = paint.amount(bigBall);
		double tankAmt = paint.amount(tank);

		System.out.println("Paint needed for deck: " + deckAmt);
		System.out.println("Paint needed for big ball: " + ballAmt);
		System.out.println("Paint needed for tank: " + tankAmt);
	}
	}


