//This example demonstrates sorting using comparable
package com.collections;
import java.io.*;
import java.util.*;
class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	public Mobile(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Mobile o) {
		if(this.ram>o.getRam()) {
			return 1;
		}
		else
			return -1;
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
    List<Mobile>mobile=new ArrayList<>();
    mobile.add(new Mobile("Redme",16,800));
    mobile.add(new Mobile("Apple",8,100));
    mobile.add(new Mobile("Samsung",4,600));
    Collections.sort(mobile);
    System.out.println("Mobiles after sorting");
    System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
    for(Mobile mb:mobile) {
    	System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
    }
    
	}

}
