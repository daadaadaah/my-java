package factorymethod.example.motor.before1;

public class LGMotor {
	private MotorStatus motorStatus ;
	public LGMotor() {
		motorStatus = MotorStatus.STOPPED ;
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
		System.out.println("move LG Motor " + direction) ;
		setMotorStatus(MotorStatus.MOVING) ;
	}
	public void stop() {
		motorStatus = MotorStatus.STOPPED ;
	}
}
