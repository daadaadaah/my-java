package factorymethod.example.carmode.before;

public class NormalState extends CarState {	
	public NormalState(Car car) {
		super(car) ;
	}
	public void speedUp(int targetSpeed) {
		System.out.print("Speed: " + car.getSpeed()) ;
		if ( targetSpeed > car.getSpeed() )
			car.setSpeed(targetSpeed) ;
		System.out.println(" ==> " + car.getSpeed()) ;
	}
	public void engineFailedDetected() {
		System.out.print("Speed: " + car.getSpeed()) ;
		car.setSpeed(LimpState.LIMP_MODE_MAX_SPEED) ;
		System.out.println(" ==> " + car.getSpeed()) ;

		car.setStae(car.getLimpMode()) ;
	}
	public void engineRepaired() {
		System.out.println("Unexpted Event") ;	
	}
}
