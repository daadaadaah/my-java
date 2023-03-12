package observer.example.elevatorcontroller;

public class FloorDisplay implements Observer {
	private ElevatorController controller ;
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller ;
	}
	public void update() {
		int curFloor = controller.getCurFloor() ;
		System.out.println("Floor Display: " + curFloor) ;
	}
}
