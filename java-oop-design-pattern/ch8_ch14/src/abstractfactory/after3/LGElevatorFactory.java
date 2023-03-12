package abstractfactory.after3;

public class LGElevatorFactory extends ElevatorFactory {
	private static ElevatorFactory factory ;
	private LGElevatorFactory() {}
	public static ElevatorFactory getInstance() {
		if ( factory == null )
			factory = new LGElevatorFactory() ;
		return factory ;
	}
	
	public Motor createMotor() {
		return new LGMotor() ;
	}
	public Door createDoor() {
		return new LGDoor() ;
	}
}
