package templatemethod.after1;

public class Client {
	public static void main(String[] args) {	
		Door door = new Door() ;
		LGMotor lgMotor = new LGMotor(door) ;
		lgMotor.move(Direction.UP) ;
	}
}
