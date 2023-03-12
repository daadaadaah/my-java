package composite.after2;

public class Speaker extends ComputerDevice {
	private int price ;
	private int power;

	public Speaker(int power, int price) {
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
