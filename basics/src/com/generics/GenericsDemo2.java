//This example demonstrate multiple type parameters in java
//We use<> to specify parameter type
package com.generics;
class Test<T,U,R>{
	T ob1;
	U ob2;
	R ob3;
	public Test(T ob1, U ob2, R ob3) {
		super();
		this.ob1 = ob1;
		this.ob2 = ob2;
		this.ob3 = ob3;
	}
	public void print() {
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}
	
}
public class GenericsDemo2 {

	public static void main(String[] args) {
    Test<String,Integer,Float>obj=new Test<>("Test",15,3.14f);
    obj.print();
	}

}
