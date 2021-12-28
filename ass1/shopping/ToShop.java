package ass1.shopping;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ToShop {
	public static void main(String[] args) {
		ArrayList<Items> Cart = new ArrayList<Items>();

		Items item;
		String itemName;
		double itemPrice;
		int quantity;

		double totalPrice = 0.0;
		double sum = 0.0;

		Scanner scan = new Scanner(System.in);
		String keepShopping = "yes";

		do {
			System.out.print("Enter the name of the item: ");
			itemName = scan.nextLine();

			System.out.print("Enter the unit price: ");
			itemPrice = scan.nextDouble();

			System.out.print("Enter the quantity: ");
			quantity = scan.nextInt();

			item = new Items(itemName, itemPrice, quantity);
			Cart.add(item);

			for (int i = 0; i < Cart.size(); i++) {
				Items itm = Cart.get(i);
			}

			System.out.print("Continue shopping (yes/no)? ");
			scan.nextLine();
			keepShopping = scan.nextLine();

		} while (keepShopping.equals("yes"));
		for (int i = 0; i < Cart.size(); i++) {

			Items itm = Cart.get(i);
			System.out.println(itm);
			totalPrice = itm.getQuantity() * itm.getPrice();
			sum += totalPrice;
		}
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		System.out.println("The total price is: " + fmt.format(sum));

	}

}
