package factorymethod.after3;


public class ElevatorManagerWithThroughputScheduling extends ElevatorManager {	
	public ElevatorManagerWithThroughputScheduling(int controllerCount) {
		super(controllerCount) ;
	}		
	protected ElevatorScheduler getScheduler() {
		ElevatorScheduler scheduler = ThroughputScheduler.getInstance() ;
		return scheduler ;
	}
}
