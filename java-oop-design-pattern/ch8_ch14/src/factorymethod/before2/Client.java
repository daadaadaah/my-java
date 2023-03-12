package factorymethod.before2;

public class Client {
	public static void main(String[] args) {		
		ElevatorManager em = new ElevatorManager(2) ;
	
		em.requestElevator(10, Direction.UP) ;
	}
}
