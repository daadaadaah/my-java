package factorymethod.after3;

public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {
	public ElevatorManagerWithResponseTimeScheduling(int controllerCount) {
		super(controllerCount) ;
	}		
	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance() ;
		return scheduler ;
	}
}
