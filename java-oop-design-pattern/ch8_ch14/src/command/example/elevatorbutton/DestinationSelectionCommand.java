package command.example.elevatorbutton;

public class DestinationSelectionCommand implements Command {
	private ElevatorController controller ;
	private int destination ;
	public DestinationSelectionCommand(int destination, ElevatorController controller) {
		this.destination = destination ;
		this.controller = controller ;
	}
	public void execute() {
		controller.gotoFloor(destination) ;
	}
}
