package factorymethod.after1;

public class Client {
	public static void main(String[] args) {
		ElevatorManager emWithResponseTimerScheduler = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME) ;
		emWithResponseTimerScheduler.requestElevator(10, Direction.UP) ;
		
		ElevatorManager emWithThroughputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT) ;
		emWithThroughputScheduler.requestElevator(10, Direction.UP) ;
		
		ElevatorManager emWithDynamicScheduler = new ElevatorManager(2, SchedulingStrategyID.DYNAMIC) ;
		emWithDynamicScheduler.requestElevator(10, Direction.UP) ;
	}
}
