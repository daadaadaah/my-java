package factorymethod.example.carmode;

public class LimpState extends CarState {
	public static final int LIMP_MODE_MAX_SPEED = 60 ;
	private static CarState state ;

	private LimpState(Car car) {
		super(car) ;
	}
	public void speedUp(int targetSpeed) {
		System.out.print("Speed: " + car.getSpeed()) ;
		if ( targetSpeed > car.getSpeed() && targetSpeed < LIMP_MODE_MAX_SPEED )
			car.setSpeed(targetSpeed) ;	
		System.out.println(" ==> " + car.getSpeed()) ;
	}
	public void engineFailedDetected() {
		// 이미 Limp Mode로 동작 중임
	}
	public static CarState getInstance(Car car) {
		if ( state == null )
			state = new LimpState(car) ;
		return state ;	
	}
	public void engineRepaired() {
		car.setStae(car.getNormalMode()) ;
	}
}
