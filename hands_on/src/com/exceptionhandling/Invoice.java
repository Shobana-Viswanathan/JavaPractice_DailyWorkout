package com.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
class IntegerValueException extends Exception{
	private static final long serialVersionUID = 1L;
	IntegerValueException(String s){
		super(s);
	}
}
class StringValueException extends Exception{
	private static final long serialVersionUID = 1L;
	public StringValueException(String s) {
		super(s);
	}
}
public class Invoice {
	private int partNumber;
	private String description;
	private int quantity;
	private double price;
	public Invoice(int partNumber, String description, int quantity, double price) {
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	public int getPartNumber() {
		return partNumber;
	}
	public String getDescription() {
		return description;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	
	public void setDescriptionString(String description) {
		this.description = description;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Invoice [partNumber=" + partNumber + ", description=" + description + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the PartNumber: ");
			int partNumber = scanner.nextInt();
			
			System.out.println("Enter the Part Description: ");
			String partDescription = scanner.nextLine();
			
			scanner.nextLine();
			
			System.out.println("Enter Quantity: ");
			int quantity = scanner.nextInt();
			
			System.out.println("Enter Price: ");
			double price = scanner.nextDouble();
			
			scanner.close();
			
			if(partNumber <= 0 || quantity <= 0 || price <=0)
				throw new IntegerValueException("Integer value must be greater than zero");
			
			if(partDescription.isEmpty())
				throw new StringValueException("Part description should not be empty");
			
			Invoice invoice = new Invoice(partNumber, partDescription, quantity, price);
			
			System.out.print(invoice.toString());
			
		}
		
		catch(InputMismatchException e) {
			System.out.print(e);
		}
		
		catch (IntegerValueException e) {
			System.out.print(e);
		}
		
		catch (StringValueException e) {
			System.out.print(e);
		}
		scanner.close();
	}
	
}
	



	


	


	
	


