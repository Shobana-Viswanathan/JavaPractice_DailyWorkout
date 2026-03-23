/*This example demonstrate the Stack Class*/
package com.collections;
import java.util.*;
public class HashSetDemo{
public static void main(String args[]){  
HashSet<String> hs=new HashSet<String>();  
System.out.println("Size of the HashSet is "+hs.size());
//adding elements
hs.add("Alpha");
hs.add("Beta");
hs.add("Gamma");
hs.add("Epsilon");
hs.add("Eta");
hs.add("Omega");
System.out.println("Elements in the HashSet "+hs);
System.out.println("Size of the HashSet is "+hs.size());
hs.remove("Eta");
System.out.println("Elements in the HashSet after remove "+hs);
System.out.println("Size of the HashSet after the removal is "+hs.size());
}
}

