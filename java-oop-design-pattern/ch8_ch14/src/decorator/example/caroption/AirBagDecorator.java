package decorator.example.caroption;

public class AirBagDecorator extends CarOptionDecorator {
	private int airBagPrice ;
	public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
		super(decoratedCar);
		this.airBagPrice = airBagPrice ;
	}
	public int getPrice() {
		int decoratedCarPrice = super.getPrice() ;
		int airBagPrice = getAirBagPrice() ;
		
		return decoratedCarPrice + airBagPrice ;
	}
	private int getAirBagPrice() {
		return airBagPrice ;
	}
	public String getCarInfo() {
		return super.getCarInfo() + " with Air Bag" ;
	}

}
