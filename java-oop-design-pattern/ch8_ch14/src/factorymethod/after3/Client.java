package factorymethod.after3;

public class Client {
	public static void main(String[] args) {		
		ElevatorManager emWithResponseTimerScheduler = new ElevatorManagerWithResponseTimeScheduling(2) ;
		emWithResponseTimerScheduler.requestElevator(10, Direction.UP) ;
		
		ElevatorManager emWithThroughputScheduler = new ElevatorManagerWithThroughputScheduling(2) ;
		emWithThroughputScheduler.requestElevator(10, Direction.UP) ;
		
		ElevatorManager emWithDynamicScheduler = new ElevatorManagerWithDynamicScheduling(2) ;
		emWithDynamicScheduler.requestElevator(10, Direction.UP) ;
	}
}
