package com.oops;
final class Hello{
	public final void display(String s) {
		System.out.println(s);
	}
}
class Sample extends Base{
	public void display(String s) {
		System.out.println(s);
	}
}
public class Base {

	public static void main(String[] args) {
   Sample obj=new Sample();
   obj.display("Try Me");
	}

}
