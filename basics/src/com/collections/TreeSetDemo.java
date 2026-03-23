/*This example demonstrate the TreeSetClass*/

package com.collections;
import java.util.*;
public class TreeSetDemo{
public static void main(String args[]){  
TreeSet<String> Ts=new TreeSet<String>();  
System.out.println("Size of the TreeSetis "+Ts.size());
//adding elements
Ts.add("C");
Ts.add("B");
Ts.add("A");
Ts.add("E");
Ts.add("F");
Ts.add("D");
System.out.println("Elements in the TreeSet"+Ts);
System.out.println("Size of the TreeSetis "+Ts.size());
Ts.remove("E");
System.out.println("Elements in the TreeSetafter remove "+Ts);
System.out.println("Size of the TreeSetafter the removal is "+Ts.size());
}
}
 
