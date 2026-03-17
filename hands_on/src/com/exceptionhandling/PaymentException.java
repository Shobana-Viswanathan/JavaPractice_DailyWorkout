package com.exceptionhandling;
import java.util.Scanner;
class AccountManagement{
int balance=80000;
void checkForDebit(int amt) throws Exception{
if(amt>30000)
throw new Exception("Transaction limit exceeded");
if(amt>balance)
throw new Exception("Insufficient balance");
}
void withdrawAmount(int amt) throws Exception{
checkForDebit(amt);
balance=balance-amt;
System.out.println("Withdraw successful");
System.out.println("Remaining balance: "+balance);
}}
public class PaymentException {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountManagement a=new AccountManagement();
		System.out.println("Enter amount to withdraw:");
		int amt=sc.nextInt();
		try{
		a.withdrawAmount(amt);
		}
		catch(Exception e){
		System.out.println(e.getMessage());
		}

	}

}
