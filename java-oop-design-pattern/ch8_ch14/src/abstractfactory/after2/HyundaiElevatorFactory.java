package abstractfactory.after2;

public class HyundaiElevatorFactory extends ElevatorFactory {
	public Motor createMotor() {
		return new HyundaiMotor() ;
	}
	public Door createDoor() {
		return new HyundaiDoor() ;
	}
}
