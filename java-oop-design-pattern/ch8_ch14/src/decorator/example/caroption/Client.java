package decorator.example.caroption;

import decorator.after3.CrossingDecorator;
import decorator.after3.LaneDecorator;
import decorator.after3.TrafficDecorator;

public class Client {
	public static void main(String[] args) {	
		CarComponent car = new BasicCar(1000) ;
		for ( String decoratorName : args ) {		
			if ( decoratorName.equalsIgnoreCase("AirBag"))
				car = new AirBagDecorator(car, 100) ;
			if ( decoratorName.equalsIgnoreCase("ESC"))
				car = new ESCDecorator(car, 50) ;
			
			if ( decoratorName.equalsIgnoreCase("Navi"))
				car = new NaviDecorator(car, 30) ;
			
			if ( decoratorName.equalsIgnoreCase("SCC"))
				car = new SCCDecorator(car, 70) ;
		}
		System.out.println(car.getPrice()) ;
		System.out.println(car.getCarInfo()) ;
		/*
		CarComponent basic = new BasicCar(1000) ;
		System.out.println(basic.getPrice()) ;

		CarComponent carWithAriBag = new AirBagDecorator(basic, 100);
		System.out.println(carWithAriBag.getPrice()) ;

		CarComponent carWithAriBagAndESC = new ESCDecorator(carWithAriBag, 50) ;
		System.out.println(carWithAriBagAndESC.getPrice()) ;

		CarComponent carWithAriBagAndNavi = new NaviDecorator(carWithAriBag, 30) ;
		System.out.println(carWithAriBagAndNavi.getPrice()) ;

		CarComponent carWithAriBagAndESCAndSSC = new SSCDecorator(carWithAriBagAndESC, 70) ;
		System.out.println(carWithAriBagAndESCAndSSC.getPrice()) ;
		*/
		
	}
}