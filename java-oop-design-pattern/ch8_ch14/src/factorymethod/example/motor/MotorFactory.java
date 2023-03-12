package factorymethod.example.motor;

public class MotorFactory {
	public static Motor getMotor(MotorVendorID vendorID) {
		Motor motor = null ;
		switch ( vendorID ) {
		case LG : motor = new LGMotor() ; break ;
		case HYUNDAI : motor = new HyundaiMotor() ; break ;
		}
		
		return motor ;
	}
}
