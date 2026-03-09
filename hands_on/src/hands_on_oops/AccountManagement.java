/**
 * Account Management System
 * This class represents a bank account in a financial organization.
 * It encapsulates account details such as account ID, account holder name,
 * and account balance
 */
package hands_on_oops;
class Account{
	private String id;
	private String name;
	private int balance;
	Account(String id,String name){
	 this.id=id;
	 this.name=name;
	 balance=0;
	}
	Account(String id,String name,int balance){
		this.id=id;
		 this.name=name;
		 this.balance=balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	int credit(int amount) {
		return balance+=amount;
		
	}
	int debit(int amount) {
		if(amount<=balance) {
			return balance -= amount;
		}
		else {
			System.out.println("Amount Exceeded");
			return balance;
		}
	}
	int transferTo(Account another,int amount) {
		if(amount<=balance) {
			this.balance -= amount;
			another.balance += amount;
			return balance;
		}
		else {
			System.out.println("Amount exceeded balance");
			return balance;
		}
	}
	public String toString() {
		return "Account[id=" + id + 
		           ", name=" + name + 
		           ", balance=" + balance + "]";
	}
	
	
}

public class AccountManagement {
public static void main(String[] args) {
   Account a1=new Account("Shobi ","abc12 ");
   Account a2=new Account("Shobana ","ab11 ",1000);
   a1.credit(4000);
   System.out.println(a1);
   a2.debit(100);
   a1.transferTo(a2, 100);
   System.out.println(a1);
   System.out.println(a2);
	}

}
