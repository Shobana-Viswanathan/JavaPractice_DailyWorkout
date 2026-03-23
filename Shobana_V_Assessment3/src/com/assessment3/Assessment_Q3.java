/**
 * Validates banking transactions using a custom exception hierarchy.
 * Throws specific exceptions for invalid account, insufficient funds, and limit violations.
 */
package com.assessment3;
import java.util.Scanner;
abstract class BankTransactionException extends Exception {
	int errorCode;
	public BankTransactionException(String message, int errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	public int getErrorCode() {
		return errorCode;
	}
}
class InsufficientFundsException extends BankTransactionException {
	double shortfall;
	public InsufficientFundsException(double shortfall) {
		super("Shortfall: " + shortfall, 1002);
		this.shortfall = shortfall;
	}
}
class InvalidAccountException extends BankTransactionException {
	public InvalidAccountException(String accountId) {
		super("Account ID cannot be empty", 1001);
	}
}
class TransactionLimitException extends BankTransactionException {
	double limit;
	public TransactionLimitException(double limit) {
		super("Limit: " + limit, 1003);
		this.limit = limit;
	}
}
class TransactionValidator {
	public static void validateTransaction(String accountId, double balance,
			double amount, double dailyLimit)
					throws BankTransactionException {
		if (accountId == null || accountId.isEmpty()) {
			throw new InvalidAccountException(accountId);
		}
		if (amount > balance) {
			throw new InsufficientFundsException(amount - balance);
		}
		if (amount > dailyLimit) {
			throw new TransactionLimitException(dailyLimit);
		}
		System.out.println("Transaction successful!");
	}
}
public class Assessment_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account ID: ");
		String accId = sc.nextLine();
		System.out.print("Enter Balance: ");
		double balance = sc.nextDouble();
		System.out.print("Enter Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Enter Daily Limit: ");
		double limit = sc.nextDouble();
		try {
		    TransactionValidator.validateTransaction(accId, balance, amount, limit);

		} 
		catch (BankTransactionException e) {
			if (e instanceof InvalidAccountException) {
				System.out.println("InvalidAccountException: " + e.getMessage() +
						" [Code: " + e.getErrorCode() + "]");
				
			}
			else if (e instanceof InsufficientFundsException) {

		        System.out.println("InsufficientFundsException: " + e.getMessage() +
		                " [Code: " + e.getErrorCode() + "]");
			} 
			else if (e instanceof TransactionLimitException) {
				System.out.println("TransactionLimitException: " + e.getMessage() +
						" [Code: " + e.getErrorCode() + "]");
			}}
		finally {
			System.out.println("Validation complete.");
		}
		sc.close();
	}
}


		
		
		
	









