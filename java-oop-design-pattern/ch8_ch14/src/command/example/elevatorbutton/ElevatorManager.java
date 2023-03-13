package command.example.elevatorbutton;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers ;
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<ElevatorController>(controllerCount) ;
	}
	public void addController(ElevatorController controller) {
		controllers.add(controller) ;
	}
	public void requestElevator(int destination, Direction direction) {		
		int selectedElevator = selectElevator(destination, direction) ;
		controllers.get(selectedElevator).gotoFloor(destination) ;		
	}
	private int selectElevator(int destination, Direction direction) {
		return 0 ; // ������ ���������͸� ������; ����� ù��° ���������͸� �����ϰ� ����
	}
}
