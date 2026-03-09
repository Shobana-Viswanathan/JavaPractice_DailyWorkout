/*
 * Illustration of Inner Classes
 */
package com.oops;
class OuterClass{
	int age=18;
	public void checkAge() {
		System.out.println("OuterClass checkAge() Method call");
	}
class InnerClass{
	public void show() {
		System.out.println("InnerClass  show() Method Call");
	}
}
}

public class InnerClasses {
public static void main(String[] args) {
  OuterClass outer =new OuterClass();
  System.out.println("OuterClasss.checkAge():"+outer.age);
  outer.checkAge();
  OuterClass.InnerClass inner=outer.new InnerClass();
  System.out.println("InnerClass Method call:");
  inner.show();
	}


}
