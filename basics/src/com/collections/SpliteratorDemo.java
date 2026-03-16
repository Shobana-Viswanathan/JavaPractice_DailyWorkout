package com.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

	public static void main(String[] args) {
    ArrayList<Double>arr=new ArrayList<Double>();
    System.out.println("Initial size of the array "+arr.size());
    arr.add(1.0);
    arr.add(2.0);
    arr.add(3.0);
    arr.add(4.0);
    arr.add(5.0);
    arr.add(6.0);
    System.out.println("Contents of arraylist using try advance");
    Spliterator<Double>sitr=arr.spliterator();
    while(sitr.tryAdvance((n)->System.out.print(n+" ")));
    System.out.println();
    System.out.println("Contents pf aaraylist using for eachremaining");
    sitr=arr.spliterator();
    sitr.forEachRemaining((n)->System.out.print(n+" "));
    System.out.println();
    System.out.println("Size of the array list after insertion is "+arr.size());

	}

}
