package factorymethod.example.motor.before2;

public class HyundaiMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move Hyundai Motor " + direction) ;
	}
}
