package factorymethod.example.motor.before1;


public class Client {
	public static void main(String[] args) {			
		LGMotor lgMotor = new LGMotor() ;
		ElevatorController controller1 = new ElevatorController(1, lgMotor) ;
		controller1.gotoFloor(5) ;		
		controller1.gotoFloor(3) ;
	}
}
