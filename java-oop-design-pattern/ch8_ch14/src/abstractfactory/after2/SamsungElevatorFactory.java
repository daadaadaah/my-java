package abstractfactory.after2;

public class SamsungElevatorFactory extends ElevatorFactory {
	public Motor createMotor() {
		return new SamsungMotor() ;
	}
	public Door createDoor() {
		return new SamsungDoor() ;
	}
}
