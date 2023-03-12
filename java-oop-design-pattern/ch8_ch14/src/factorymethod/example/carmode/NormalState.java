package factorymethod.example.carmode;

public class NormalState extends CarState {
	private static CarState state ;
	
	private NormalState(Car car) {
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
	public static CarState getInstance(Car car) {
		if ( state == null )
			state = new NormalState(car) ;
		return state ;	
	}
	public void engineRepaired() {
		System.out.println("Unexpted Event") ;	
	}
}
