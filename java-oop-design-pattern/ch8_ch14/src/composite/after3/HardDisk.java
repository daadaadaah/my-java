package composite.after3;

public class HardDisk extends ComputerDevice {
	private int price ;
	private int power;

	public HardDisk(int power, int price) {
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
