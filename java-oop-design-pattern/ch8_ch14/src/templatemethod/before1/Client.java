package templatemethod.before1;

public class Client {
	public static void main(String[] args) {
		Door door = new Door() ;
		HyundaiMotor hyundaiMotor = new HyundaiMotor(door) ;
		hyundaiMotor.move(Direction.UP) ;
	}
}
