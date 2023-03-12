package templatemethod.before1;

public class HyundaiMotor {
	private Door door ;
	private MotorStatus motorStatus ;
	
	public HyundaiMotor(Door door) {
		this.door = door ;
		motorStatus = MotorStatus.STOPPED ;
	}	
	private void moveHyundaiMotor(Direction direction) {
		// Hyundai Motor를 구동시킨다.
	}
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}
	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus() ;
		if (  motorStatus == MotorStatus.MOVING ) return ;
		
		DoorStatus doorStatus = door.getDoorStatus() ;
		if ( doorStatus == DoorStatus.OPENED )
			door.close() ;
		
		moveHyundaiMotor(direction) ;
		
		setMotorStatus(MotorStatus.MOVING) ;
	}
}
