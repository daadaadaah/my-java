package abstractfactory.after1;

public abstract class Motor {
	private Door door ;
	private MotorStatus motorStatus ;
	
	public Motor() {
		motorStatus = MotorStatus.STOPPED ;
	}
	public void setDoor(Door door) {
		this.door = door ;
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
		
		moveMotor(direction) ;
		
		setMotorStatus(MotorStatus.MOVING) ;
	}
	protected abstract void moveMotor(Direction direction) ;
}
