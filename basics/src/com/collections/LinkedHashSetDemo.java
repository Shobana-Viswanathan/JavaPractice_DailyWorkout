/*This example demonstrate the Stack Class*/
package com.collections;
import java.util.*;
public class LinkedHashSetDemo {
public static void main(String args[]){  
LinkedHashSet<String> hs=new LinkedHashSet<String>();  
System.out.println("Size of the LinkedHashSetis "+hs.size());
//adding elements
hs.add("Alpha");
hs.add("Beta");
hs.add("Gamma");
hs.add("Epsilon");
hs.add("Eta");
hs.add("Omega");
System.out.println("Elements in the LinkedHashSet"+hs);
System.out.println("Size of the LinkedHashSetis "+hs.size());
hs.remove("Eta");
System.out.println("Elements in the LinkedHashSetafter remove "+hs);
System.out.println("Size of the LinkedHashSetafter the removal is "+hs.size());
}
}

