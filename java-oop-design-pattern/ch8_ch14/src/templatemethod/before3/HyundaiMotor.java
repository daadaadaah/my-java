package templatemethod.before3;

public class HyundaiMotor extends Motor {
	public HyundaiMotor(Door door) {
		super(door) ;
	}	
	private void moveHyundaiMotor(Direction direction) {
		// Hyundai Motor�� ������Ų��.
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
