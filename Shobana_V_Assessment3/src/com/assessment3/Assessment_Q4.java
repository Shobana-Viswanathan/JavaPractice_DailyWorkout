/**
 * Manages product details using a collection and performs sorting and filtering.
 * Provides a menu-driven application to sort by ID and list products based on price.
 */
package com.assessment3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Product implements Comparable<Product> {
	int productId;
	String productName;
	String productCategory;
	double productPrice;
	double productDiscount;
	int productQuantity;
	public Product(int productId, String productName, String productCategory,
			double productPrice, double productDiscount, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productDiscount = productDiscount;
		this.productQuantity = productQuantity;
	}
	public int compareTo(Product p) {
		return this.productId - p.productId;
	}
	void display() {
		System.out.println(productId + " | " + productName + " | " + productCategory +
				" | " + productPrice + " | " + productDiscount + " | " + productQuantity);
	}
}
public class Assessment_Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		System.out.print("Enter number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for product " + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Category: ");
			String category = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("Discount: ");
			double discount = sc.nextDouble();
			System.out.print("Quantity: ");
			int qty = sc.nextInt();
			sc.nextLine();
			list.add(new Product(id, name, category, price, discount, qty));
		}
		while (true) {
			System.out.println("\n1. Sort by Id ");
			System.out.println("2. List Mobiles with price more than 40000 ");
			System.out.println("3. Exit");
			System.out.print("Enter option: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Collections.sort(list);
				for (Product p : list) {
					p.display();
				}
				break;
			case 2:
				for (Product p : list) {
					if (p.productCategory.equalsIgnoreCase("Mobile") && p.productPrice > 40000) {
						p.display();
					}
				}
				break;
			case 3:
				System.out.println("Thank you!!");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice");
			}
			}
		}
	}

			
			
			
			
		
		
	
			
			
			
				
				










