package composite.after2;

public class Monitor extends ComputerDevice {
	private int price ;
	private int power;

	public Monitor(int power, int price) {
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
