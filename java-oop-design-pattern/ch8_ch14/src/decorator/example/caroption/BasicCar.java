package decorator.example.caroption;

public class BasicCar extends CarComponent {
	private int price ;	
	public BasicCar(int price) {
		this.price = price ;
	}
	public int getPrice() {
		return price ;
	}
	public String getCarInfo() {
		return "Car" ;
	}
}
