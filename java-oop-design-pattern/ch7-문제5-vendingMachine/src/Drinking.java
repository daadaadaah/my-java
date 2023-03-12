//package vending;

public class Drinking {
	private int price;
	private int stock;

	public Drinking(int stock, int price) {
		this.stock = stock;
		this.price = price;
	}

	public void dispense() {
		this.stock--;
	}

	public int getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}
}
