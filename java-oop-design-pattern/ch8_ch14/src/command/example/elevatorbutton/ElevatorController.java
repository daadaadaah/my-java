package command.example.elevatorbutton;

public class ElevatorController {
	private int id ;
	private int curFloor ;	
	public ElevatorController(int id) {
		this.id = id ;
	}
	public void gotoFloor(int destination) {
		curFloor = destination ;
		System.out.println("Elevator [" + id + "] Current Floor: " + curFloor) ;
	}
}
