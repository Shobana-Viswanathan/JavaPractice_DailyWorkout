package com.fileIo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee3 implements java.io.Serializable{
	public int empId;
	public String empName;
	// parameterized constructor
	public Employee3(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
}
public class Seriallization {

	public static void main(String[] args) {
    Employee3 object=new Employee3(1,"Ram");
    String filename="file.ser";
    //serialization
    try {
    	//saving of objects in a file
    	FileOutputStream file=new FileOutputStream(filename);
    	ObjectOutputStream out=new ObjectOutputStream(file);
    	//method for serialization of object
    	out.writeObject(object);
    	out.close();
    	file.close();
    	System.out.println("Object has been serialized");
    }
    catch(IOException ex) {
    	System.out.println("IOException is caught");
    }
    Employee3 object1=null;
    //deserialization
    try {
    	FileInputStream file=new FileInputStream(filename);
    	ObjectInputStream in = new ObjectInputStream(file);
    	//method for deserialization of object
    	object1=(Employee3)in.readObject();
    	in.close();
    	file.close();
    	System.out.println("Object has been deserialized");
    	System.out.println("EmployeeId= "+object1.empId+" Employee Name= "+object1.empName);
    	
    }
    catch(IOException ex) {
    	System.out.println("IOEXCeption is caught");
    }
    catch(ClassNotFoundException ex) {
    	System.out.println("ClassNotFoundException is caught");
    }
	}

}
