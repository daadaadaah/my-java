package decorator.example.caroption;

public class ESCDecorator extends CarOptionDecorator {
	private int escPrice ;
	public ESCDecorator(CarComponent decoratedCar, int escPrice) {
		super(decoratedCar);
		this.escPrice = escPrice ;
	}
	public int getPrice() {
		int decoratedCarPrice = super.getPrice() ;
		int escPrice = getESCPrice() ;
		
		return decoratedCarPrice + escPrice ;
	}
	private int getESCPrice() {
		return escPrice ;
	}
	public String getCarInfo() {
		return super.getCarInfo() + " with Electronic Stability Control" ;
	}
}
