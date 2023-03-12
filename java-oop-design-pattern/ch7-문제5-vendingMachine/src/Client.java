//package vending;

public class Client {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine(0, 1000);

		machine.insertMoney(1000);
		System.out.println(machine.getState());
		machine.insertMoney(500);
		System.out.println(machine.getState());
		machine.pushButton();
		System.out.println(machine.getState());
		machine.returnMoney();
		System.out.println(machine.getState());
		machine.insertMoney(1000);
		System.out.println(machine.getState());
		machine.insertMoney(1000);
		System.out.println(machine.getState());
		machine.pushButton();
		System.out.println(machine.getState());
	}
}
