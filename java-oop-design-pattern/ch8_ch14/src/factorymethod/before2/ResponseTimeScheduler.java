package factorymethod.before2;

public class ResponseTimeScheduler implements ElevatorScheduler {
	public int selectElevator(ElevatorManager manager, int destination, Direction direction) {	
		return 1 ;	
	}
}
