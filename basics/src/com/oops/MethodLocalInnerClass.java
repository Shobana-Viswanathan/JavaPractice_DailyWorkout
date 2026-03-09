/* Illustration of Method Local Inner Classes */
package com.oops;
class Outer{
	int val=56;
	public void outerClassMethod() {
		System.out.println("Inside the method of outer class");
		class Inner{
			public void innerClassMethod() {
				System.out.println("Inside the method of inner class");
				System.out.println("Value:"+val);
			}
		}
		Inner inner=new Inner();
		inner.innerClassMethod();
	}
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
    Outer outer = new Outer();
    outer.outerClassMethod();
	}

}
