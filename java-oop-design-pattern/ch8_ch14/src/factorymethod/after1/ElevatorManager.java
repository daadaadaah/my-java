package factorymethod.after1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import factorymethod.before1.ElevatorController;

public class ElevatorManager {
	private List<ElevatorController> controllers ;
	private SchedulingStrategyID strategyID ;

	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
		controllers = new ArrayList<ElevatorController>(controllerCount) ;
		for ( int i = 0 ; i < controllerCount ; i ++ ) {
			ElevatorController controller = new ElevatorController(i+1) ;
			controllers.add(controller) ;
		}
		this.strategyID = strategyID ;
	}
	public void setStrategyID(SchedulingStrategyID strategyID) {
		this.strategyID = strategyID;
	}
	void requestElevator(int destination, Direction direction) {	
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID) ;
		System.out.println(scheduler) ; // Singleton Pattern이 아니라서 Scheduler Object가  다르게 된다.
			
		int selectedElevator = scheduler.selectElevator(this, destination, direction) ;		
		controllers.get(selectedElevator).gotoFloor(destination) ;
	}
}
