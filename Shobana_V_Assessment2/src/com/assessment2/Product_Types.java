/*
 * This program demonstrates abstraction and inheritance using a Product class.
 * ElectronicProduct and ClothingProduct extend the Product class and override
 * the displayInfo() method to show product details entered by the user.
 */
package com.assessment2;
import java.util.*;
abstract class Product{
    int productId;
	String productName;
	double price;
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	abstract void displayInfo();}
class ElectronicProduct extends Product{
	int warrantyPeriod;
	public ElectronicProduct(int productId,String productName,double price,int warrantyPeriod) {
		super(productId,productName,price);
		this.warrantyPeriod = warrantyPeriod;
	}
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}
	public void displayInfo() {
		System.out.println("\nELECTRONIC PRODUCT INFORMATION:");
		System.out.println("Productid " + productId);
		System.out.println("ProductName : " + productName);
		System.out.println("Price : $" + price);
		System.out.println("Warranty Period : " + warrantyPeriod + " Months");
	}
}
class ClothingProduct extends Product{
	String size;
	String material;
	public ClothingProduct(int productId,String productName,double price,String size,String material) {
		super(productId,productName,price);
		this.size = size;
		this.material = material;
	}
	public String getSize() {
		return size;
	}
	
	public String getMaterial() {
		return material;
	}
	public void displayInfo() {
		System.out.println("\nCLOTHING PRODUCT INFORMATION:");
		System.out.println("Productid " + productId);
		System.out.println("ProductName : " + productName);
		System.out.println("Price : $" + price);
		System.out.println("Size : " + size);
		System.out.println("Material : " + material);
	}
}
public class Product_Types {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Electronic Product ID:");
		int eid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Electronic Product Name:");
		String ename = sc.nextLine();
		System.out.println("Enter Electronic Product Price:");
		double eprice = sc.nextDouble();
		System.out.println("Enter Warranty Period (Months):");
		int warranty = sc.nextInt();
		ElectronicProduct e1 = new ElectronicProduct(eid,ename,eprice,warranty);
		System.out.println("\nEnter Clothing Product ID:");
		int cid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Clothing Product Name:");
		String cname = sc.nextLine();
		System.out.println("Enter Clothing Product Price:");
		double cprice = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Size:");
		String size = sc.nextLine();
		System.out.println("Enter Material:");
		String material = sc.nextLine();
		ClothingProduct c1 = new ClothingProduct(cid,cname,cprice,size,material);
		e1.displayInfo();
		c1.displayInfo();
		sc.close();}}
		
		
		
		
		
		
		
		
		
		
		
	
	
	










     
