/*
 * Digital Online Payment System
 * This program uses abstraction and inheritance to support multiple payment methods
 * like Credit Card, UPI, and NetBanking with a common transaction workflow.
 */
package hands_on_oops;

import java.util.*;

abstract class Payment {

	protected String transactionId;
	protected double amount;
	protected String customerName;
	protected String paymentStatus;
	public String getTransactionId() {
	    return transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public Payment(String transactionId, double amount, String customerName) {
		this.transactionId = transactionId;
		this.amount = amount;
		this.customerName = customerName;
		this.paymentStatus = "Pending";
	}
	abstract boolean validatePayment();
	abstract boolean processPayment();
	public void executeTransaction() {
		if (validatePayment()) {
			if (processPayment()) {
				setPaymentStatus("Success");
			} else {
				setPaymentStatus("Failed");
			}
		} else {
			setPaymentStatus("Validation Failed");
		}
		generateReceipt();}
	public void generateReceipt() {
		System.out.println("\n*** PAYMENT RECEIPT ***");
		System.out.println("Transaction ID : " + transactionId);
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Amount         : " + amount);
		System.out.println("Status         : " + paymentStatus);
	}
	public void setPaymentStatus(String status) {
		this.paymentStatus = status;
	}
}
class CreditCardPayment extends Payment {
	private String cardNumber;
	private String cvv;
	private String expiryDate;
	public CreditCardPayment(String transactionId, double amount, String customerName, String cardNumber, String cvv,
			String expiryDate) {
		super(transactionId, amount, customerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
		
	}
	boolean validatePayment() {
		return cardNumber.length() == 16 && cvv.length() == 3;
	}
	
	boolean processPayment() {
		System.out.println("Processing Credit Card Payment...");
		return true;
	}
}
class UPIPayment extends Payment {
	private String upiId;
	private String upiPin;
	public UPIPayment(String transactionId, double amount, String customerName, String upiId, String upiPin) {
		
		super(transactionId, amount, customerName);
		this.upiId = upiId;
		this.upiPin = upiPin;
	}
	boolean validatePayment() {
		return upiId.contains("@") && upiPin.length() == 4;
	}
	
	boolean processPayment() {
		System.out.println("Processing UPI Payment...");
		return true;
	}
}

class NetBankingPayment extends Payment {
	
	private String bankName;
	private String accountNumber;
	private String ifscCode;
	
	public NetBankingPayment(String transactionId, double amount, String customerName, String bankName,
			String accountNumber, String ifscCode) {
		
		super(transactionId, amount, customerName);
		this.bankName = bankName;
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
	}
	
	boolean validatePayment() {
		return accountNumber.length() >= 10 && ifscCode.length() == 11;
	}
	
	boolean processPayment() {
		System.out.println("Processing Net Banking Payment...");
		return true;
	}
}

public class DigitalOnlinePay {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Payment payment; 
		int choice;
		
		System.out.println("---- Digital Payment System ----");
		
		System.out.print("Enter Transaction ID: ");
		String id = sc.nextLine();
		
		System.out.print("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		
		do {
			
			System.out.println("\nPayment Options:");
			System.out.println("1. Credit Card Payment");
			System.out.println("2. Net Banking Payment");
			System.out.println("3. UPI Payment");
			System.out.println("4. Exit");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			
			case 1:
				
				System.out.print("Enter Card Number: ");
				String cardnumber = sc.next();
				
				System.out.print("Enter CVV: ");
				String cvv = sc.next();
				
				System.out.print("Enter Expiry Date: ");
				String expiryDate = sc.next();
				
				payment = new CreditCardPayment(id, amount, name, cardnumber, cvv, expiryDate);
				
				payment.executeTransaction();
				break;
				
			case 2:
				
				System.out.print("Enter Bank Name: ");
				String bankName = sc.next();
				
				System.out.print("Enter Account Number: ");
				String accountNumber = sc.next();
				
				System.out.print("Enter IFSC Code: ");
				String ifscCode = sc.next();
				
				payment = new NetBankingPayment(id, amount, name, bankName, accountNumber, ifscCode);
				
				payment.executeTransaction();
				break;
				
			case 3:
				
				System.out.print("Enter UPI ID: ");
				String upiId = sc.next();
				
				System.out.print("Enter UPI PIN: ");
				String upiPin = sc.next();
				
				payment = new UPIPayment(id, amount, name, upiId, upiPin);
				
				payment.executeTransaction();
				break;
				
			case 4:
				System.out.println("Exiting...");
				break;
				
			default:
				System.out.println("Invalid choice");
			}
			
		} while (choice != 4);
		
		sc.close();
	}
}








	









