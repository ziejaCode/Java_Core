package _11_ObjectOrientedPrograming.ShoppingAplication;

public class ListItem {

			String name;
			double price;
			int quantity;
			
			public ListItem(String name, double price, int quantity) {
				this.name = name;
				this.price = price;
				this.quantity = quantity;
			
			}

			public String getName() {
				return name;
			}

			public double getPrice() {
				return price;
			}

			public int getQuantity() {
				return quantity;
			}
			
			
	
}
