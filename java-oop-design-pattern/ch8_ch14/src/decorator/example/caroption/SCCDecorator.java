package decorator.example.caroption;

public class SCCDecorator extends CarOptionDecorator {
	private int sccPrice ;
	public SCCDecorator(CarComponent decoratedCar, int sccPrice) {
		super(decoratedCar);
		this.sccPrice = sccPrice ;
	}
	public int getPrice() {
		int decoratedCarPrice = super.getPrice() ;
		int sscPrice = getSCCPrice() ;
		
		return decoratedCarPrice + sscPrice ;
	}
	private int getSCCPrice() {
		return sccPrice ;
	}
	public String getCarInfo() {
		return super.getCarInfo() + " with Smart Cruise Conrol" ;
	}
}
