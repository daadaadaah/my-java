package decorator.example.caroption;

public class NaviDecorator extends CarOptionDecorator {
	private int naviPrice ;
	public NaviDecorator(CarComponent decoratedCar, int naviPrice) {
		super(decoratedCar);
		this.naviPrice = naviPrice ;
	}
	public int getPrice() {
		int decoratedCarPrice = super.getPrice() ;
		int naviPrice = getNaviPrice() ;
		
		return decoratedCarPrice + naviPrice ;
	}
	private int getNaviPrice() {
		return naviPrice ;
	}
	public String getCarInfo() {
		return super.getCarInfo() + " with Navigation" ;
	}
}
