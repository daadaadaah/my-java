package composite.before3;

public class Body {
	
	// body에 CPU, HardDisk, MainMemory 추가하는 것이 필요함

	private int price ;
	private int power;

	public Body(int power, int price) {
		this.power = power ;
		this.price = price ;
	}
	public int getPrice() {
		return price ;
	}
	public int getPower() {
		return power;
	}
}
