/*
 * Movable Interface Implementation
 * This program demonstrates the use of interfaces, composition, and polymorphism in Java.
 * The Movable interface defines movement methods, while MovablePoint and MovableCircle
 * implement these methods to simulate object movement with speed and position.
 */
package hands_on_oops;
interface Movable{
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}
class MovablePoint implements Movable{
	 int x;
	 int y;
	 int xSpeed;
	 int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	 public String toString() {
	        return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
	    }
	public void moveUp() {
		y += ySpeed;
	}
public void moveDown() {
		y -= ySpeed;
	}
public void moveLeft() {
	x -= xSpeed;
}
public void moveRight() {
	x -= xSpeed;
}
}
class MovableCircle implements Movable{
	private int radius;
	private  MovablePoint center;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
	    center = new MovablePoint(x, y, xSpeed, ySpeed);
	    this.radius = radius;
	}
	 public String toString() {
	        return center.toString() + ", radius=" + radius;
	    }
	 public void moveUp() {
	        center.moveUp();
	    }

	    public void moveDown() {
	        center.moveDown();
	    }

	    public void moveLeft() {
	        center.moveLeft();
	    }
	    public void moveRight() {
	        center.moveRight();
	    }
}
public class Speed {

	public static void main(String[] args) {

        MovablePoint p = new MovablePoint(2,3,1,1);
        System.out.println(p);

        p.moveUp();
        p.moveRight();

        System.out.println(p);

        MovableCircle c = new MovableCircle(1,2,2,2,5);
        System.out.println(c);
	}

}
