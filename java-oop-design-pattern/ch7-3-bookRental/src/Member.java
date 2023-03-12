

public class Member {
	private String name;
	private int accPrice;

	public Member(String name) {
		this.name = name;
		accPrice = 0;
	}

	public String getName() {
		return name;
	}

	public void addAccPrice(int price) {
		accPrice += price;
	}

	public int getAccPrice() {
		return accPrice;
	}
}
