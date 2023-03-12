package factorymethod.example.carmode.before;

public abstract class CarState {
	protected Car car;
	protected CarState(Car car) {
		this.car = car ;
	}
	public void stop() {
		car.setSpeed(0) ;
	}
	public void speedDown(int targetSpeed) {
		System.out.print("Speed: " + car.getSpeed()) ;
		if ( targetSpeed < car.getSpeed() )
			car.setSpeed(targetSpeed) ;
		
		System.out.println(" ==> " + car.getSpeed()) ;
		
	}
	public abstract void speedUp(int targetSpeed) ;
	public abstract void engineFailedDetected() ;
	public abstract void engineRepaired() ;
	
}
