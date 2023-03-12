package factorymethod.example.carmode;

public class Car {
	private int speed ;

	private CarState normalState ;
	private CarState limpState ;
	
	private CarState curState ;
	
	public Car() {
		normalState = CarStateFactory.getState(CarStateID.NORMAL, this) ;
		limpState = CarStateFactory.getState(CarStateID.LIMP_MODE, this) ;
		curState = normalState ;
	}
	public CarState getLimpMode() {
		return limpState ;
	}
	public void setStae(CarState state) {
		curState = state ;	
	}
	
	public void stop() {
		curState.stop() ;
	}
	public void speedDown(int targetSpeed) {
		curState.speedDown(targetSpeed) ;
	}
	public  void engineFailedDetected() {
		curState.engineFailedDetected() ;
	}
	public  void speedUp(int targetSpeed) {
		curState.speedUp(targetSpeed) ;
	}
	public void engineRepaired() {
		curState.engineRepaired() ;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public CarState getNormalMode() {
		return normalState ;
	}
}
