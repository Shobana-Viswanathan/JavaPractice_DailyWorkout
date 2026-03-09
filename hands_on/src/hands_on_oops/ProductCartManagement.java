/**
 * Product Cart Management System
 * This system models an online shopping cart where customers
 * can add, remove, and manage products
 */
 
  
package hands_on_oops;
import java.util.ArrayList;
import java.util.List;

class Product{
	private int id;
	private String name;
	private double price;
	private int quantity;
	Product(int id,String name,double price,int quantity){
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int newQty) {
		this.quantity = newQty;
		if(newQty>=0) {
			this.quantity=newQty;
			}
		else {
			System.out.println("Invalid Quantity");
		}
	}
	public void getProductDetails() {
		System.out.println("Proudct ID:"+id);
		System.out.println("Product Name:"+name);
		System.out.println("Product Price:"+price);
		System.out.println("Product Quantity:"+quantity);
	}
	double calculateTotal() {
		return price*quantity;
	}
	
}
class Cart{
	private List<Product> products =new ArrayList <> ();
	public void addProduct(Product p) {
		products.add(p);
	}
	public void removeProduct(int productid) {
		for(Product b:products) {
			if(b.getId()==productid) {
				products.remove(b);
			}
		}
		}
	public void calculateCartTotal() {
		double tot=0;
		for(Product b:products) {
			tot+=b.calculateTotal();
		}
		System.out.println("Total:"+tot);
	}
	public void displayCartItems() {
		for(Product b:products) {
			b.getProductDetails();
		}
	}
	
}
public class ProductCartManagement {
	public static void main(String[] args) {
    Product p1=new Product(100,"Choclates",200.50,2);
    Product p2=new Product(101,"Powder",150.50,3);
    Cart p=new Cart();
    p.addProduct(p1);
    p.addProduct(p2);
    p.displayCartItems();
    System.out.println("---After Removal---");
    p.removeProduct(100);
    p.displayCartItems();
	}
}


