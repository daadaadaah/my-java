package abstractfactory.after2;

public class LGElevatorFactory extends ElevatorFactory {
	public Motor createMotor() {
		return new LGMotor() ;
	}
	public Door createDoor() {
		return new LGDoor() ;
	}
}
