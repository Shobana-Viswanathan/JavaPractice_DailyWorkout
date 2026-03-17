//This example demonstrate sorting using comparable and comparator
package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile1 implements Comparable<Mobile1>{
	private String name;
	private int ram;
	private int price;
	public Mobile1(String name, int ram, int price) {
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
	public int compareTo(Mobile1 o) {
		if(this.ram>o.getRam()) {
			return 1;
		}
		else
			return -1;
	}}
	class PriceCompare implements Comparator<Mobile1> {
		public int compare(Mobile1 m1,Mobile1 m2) {
			if(m1.getPrice()<m2.getPrice())return -1;
			if(m1.getPrice()>m2.getPrice())return 1;
			else return 0;
		}
	}
	class NameCompare implements Comparator<Mobile1>{
		public int compare(Mobile1 m1,Mobile1 m2) {
			return m1.getName().compareTo(m2.getName());
			
		}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		 List<Mobile1> mobileList = new ArrayList<>();

	        mobileList.add(new Mobile1("Redmi", 16, 800));
	        mobileList.add(new Mobile1("Apple", 8, 100));
	        mobileList.add(new Mobile1("Samsung", 4, 600));

	        System.out.println("Sorted by Price");

	        Collections.sort(mobileList, new PriceCompare());

	        System.out.println("Name\tRam\tPrice");

	        for (Mobile1 mb : mobileList) {
	            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
	        }
	}

}
