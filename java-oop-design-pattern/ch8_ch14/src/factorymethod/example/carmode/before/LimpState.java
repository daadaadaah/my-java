package factorymethod.example.carmode.before;

public class LimpState extends CarState {
	public static final int LIMP_MODE_MAX_SPEED = 60 ;
	public LimpState(Car car) {
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
	public void engineRepaired() {
		car.setStae(car.getNormalMode()) ;
	}
}
