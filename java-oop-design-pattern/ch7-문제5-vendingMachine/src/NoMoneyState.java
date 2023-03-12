//package vending;

public class NoMoneyState implements State {
	VendingMachine machine;

	public NoMoneyState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertMoney(int money) {
		machine.getMoneyBox().insert(money);
		System.out.println(money + "원을  넣었습니다");
		if (money >= machine.getDrinking().getPrice()) {
			machine.setState(machine.getEnoughMoneyState());
		} else {
			machine.setState(machine.getNoEnoughMoneyState());
		}
		System.out.println("현재금액은" + machine.getMoneyBox().getMoney() + "원입니다.");
	}

	@Override
	public void pushButton(int price) {
		System.out.println("동전을 넣어주세요");
	}

	@Override
	public void returnMoney() {
		System.out.println("반환할 동전이 없어용");
	}

}
