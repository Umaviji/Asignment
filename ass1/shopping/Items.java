package ass1.shopping;

import java.text.NumberFormat;

public class Items {
     private String name;
     private double price;
     private int quantity;
     
     public Items(String itemname,double itemprice,int numpurchased) {
    	 name=itemname;
    	 price=itemprice;
    	 quantity=numpurchased;
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

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public String toString() {
	
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		 String Tab = name.length() > 8 ? "\t" : "\t\t";
		 return name + Tab + fmt.format( price ) + "\t\t" + quantity + "\t\t" + fmt.format( price * quantity);
	}
    	 
}


