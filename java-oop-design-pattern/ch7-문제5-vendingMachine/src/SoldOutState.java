//package vending;

public class SoldOutState implements State {
	VendingMachine machine;

	public SoldOutState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney(int money) {
		System.out.println("��� �����ϴ�.");
	}

	@Override
	public void pushButton(int price) {
		System.out.println("...");
	}

	@Override
	public void returnMoney() {
		int tmp = machine.getMoneyBox().returnMoney();
		System.out.println(tmp + "���� ��ȯ�Ǿ����ϴ�.");
		machine.setState(machine.getNoMoneyState());
	}
}
