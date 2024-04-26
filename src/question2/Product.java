package question2;

public class Product implements Taxable {

	private int pID;
	private double price;
	private int quantity;
	

	public Product(int pID,double price,int quantity) {
		this.pID=pID;
		this.price=price;
		this.quantity=quantity;
	}
	
	
	public double calcTax() {
		return price*salesTax*quantity;
	}	
}