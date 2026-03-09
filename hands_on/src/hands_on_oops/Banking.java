/**
 * Banking system demonstrating Dynamic Polymorphism.
 * RBI is the base class. SBI, ICICI and PNB override the
 * interest rate and withdrawal limit methods.
 */
package hands_on_oops;

import java.util.*;

class Customer{
	int id;
	String name;

	Customer(int id,String name){
		this.id=id;
		this.name=name;
	}
}

class Account1{
	int accNo;
	double balance;

	Account1(int accNo,double balance){
		this.accNo=accNo;
		this.balance=balance;
	}
}

class RBI{
	Customer c;
	Account1 a;

	RBI(Customer c,Account1 a){
		this.c=c;
		this.a=a;
	}

	public double getInterestRate(){
		return 4.0;
	}

	public double getWithdrawalLimit(){
		return 20000;
	}
}

class SBI extends RBI{

	SBI(Customer c,Account1 a){
		super(c,a);
	}

	public double getInterestRate(){
		return 5.5;
	}

	public double getWithdrawalLimit(){
		return 40000;
	}
}

class ICICI extends RBI{

	ICICI(Customer c,Account1 a){
		super(c,a);
	}

	public double getInterestRate(){
		return 6.0;
	}

	public double getWithdrawalLimit(){
		return 50000;
	}
}

class PNB extends RBI{

	PNB(Customer c,Account1 a){
		super(c,a);
	}

	public double getInterestRate(){
		return 5.0;
	}

	public double getWithdrawalLimit(){
		return 30000;
	}
}

public class Banking{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Customer ID:");
		int cid=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Customer Name:");
		String name=sc.nextLine();

		System.out.println("Enter Account Number:");
		int acc=sc.nextInt();

		System.out.println("Enter Balance:");
		double bal=sc.nextDouble();

		Customer c=new Customer(cid,name);
		Account1 a=new Account1(acc,bal);

		System.out.println("Select Bank");
		System.out.println("1.SBI");
		System.out.println("2.ICICI");
		System.out.println("3.PNB");

		int choice=sc.nextInt();

		RBI bank;

		switch(choice){
			case 1:
				bank=new SBI(c,a);
				break;
			case 2:
				bank=new ICICI(c,a);
				break;
			case 3:
				bank=new PNB(c,a);
				break;
			default:
				System.out.println("Invalid Choice");
				return;
		}

		System.out.println("Interest Rate: "+bank.getInterestRate()+"%");
		System.out.println("Withdrawal Limit: "+bank.getWithdrawalLimit());

		sc.close();
	}
}