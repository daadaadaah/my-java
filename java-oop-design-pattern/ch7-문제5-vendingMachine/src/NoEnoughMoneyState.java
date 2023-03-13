//package vending;

public class NoEnoughMoneyState implements State {
	VendingMachine machine;

	public NoEnoughMoneyState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney(int money) {
		machine.getMoneyBox().insert(money);
		System.out.println(money + "���� �־����ϴ�");
		if (machine.getMoneyBox().getMoney() >= machine.getDrinking().getPrice()) {
			machine.setState(machine.getEnoughMoneyState());
		} else {
			machine.setState(machine.getNoEnoughMoneyState());
		}
		System.out.println("����ݾ���" + machine.getMoneyBox().getMoney() + "���Դϴ�");
	}

	@Override
	public void pushButton(int price) {
		System.out.println("������ �����մϴ�.");
	}

	@Override
	public void returnMoney() {
		int tmp = machine.getMoneyBox().returnMoney();
		System.out.println(tmp + "���� ��ȯ�Ǿ����ϴ�.");
		machine.setState(machine.getNoMoneyState());
	}


}
