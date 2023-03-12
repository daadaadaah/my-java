//package vending;

public class MoneyBox {
	int money = 0;

	public int getMoney() {
		return money;
	}

	public void insert(int money) {
		this.money += money;
	}

	public void dispense(int price) {
		this.money -= price;
	}

	public int returnMoney() {
		int tmp = this.money;
		this.money = 0;
		return tmp;
	}

}
