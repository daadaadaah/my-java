package factorymethod.example.motor;

public class Client {
	public static void main(String[] args) {			
		Motor lgMotor = MotorFactory.getMotor(MotorVendorID.LG) ;
		ElevatorController controller1 = new ElevatorController(1, lgMotor) ;
		controller1.gotoFloor(5) ;		
		controller1.gotoFloor(3) ;
		
		Motor hyundaiMotor = MotorFactory.getMotor(MotorVendorID.HYUNDAI) ;
		ElevatorController controller2 = new ElevatorController(2, hyundaiMotor) ;
		controller2.gotoFloor(4) ;		
		controller2.gotoFloor(6) ;
	}
}
