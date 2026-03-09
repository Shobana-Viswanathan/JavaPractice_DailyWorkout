/* Illustration of Static Nested Classes */
package com.oops;
class Person1{
	int age=21; static int weight=48;
	static class Gender{
		void nonStaticDisplay(){
			System.out.println("In NonStatic Display Method");
			System.out.println("Weight Value:"+weight);//outer class static variable accessed in NonStatic method
		}
		static void staticDisplay() {
			System.out.println("In Static Display Method");
			System.out.println("Weight Value:"+weight);
		}
	}
	Gender gender =new Gender();
}
public class InnerClassesdemo2 {

	public static void main(String[] args) {
    Person1 person=new Person1();
    person.gender.nonStaticDisplay();//Innerclass NonStatic method
    Person1.Gender.staticDisplay();//Inner class static method
	}

}
