package abstractfactory.before1;

public class Client {
	public static void main(String[] args) {
		Door lgDoor = DoorFactory.createDoor(VendorID.LG) ;
		Motor lgMotor = MotorFactory.createMotor(VendorID.LG) ;
		lgMotor.setDoor(lgDoor) ;
		
		lgDoor.open() ;
		lgMotor.move(Direction.UP) ;
			
		Door hyundaiDoor = DoorFactory.createDoor(VendorID.HYUNDAI) ;
		Motor hyundaiMotor = MotorFactory.createMotor(VendorID.HYUNDAI) ;
		hyundaiMotor.setDoor(hyundaiDoor) ;
		
		hyundaiDoor.open() ;
		hyundaiMotor.move(Direction.UP) ;
	}
}
