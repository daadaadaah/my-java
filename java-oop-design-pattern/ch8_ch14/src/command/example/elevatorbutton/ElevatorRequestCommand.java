package command.example.elevatorbutton;

public class ElevatorRequestCommand implements Command {
	private Direction direction ;
	private int destination ;
	private ElevatorManager manager ;	
	public ElevatorRequestCommand(int destination, Direction direction, ElevatorManager manager) {
		this.destination = destination ;
		this.direction = direction ;
		this.manager = manager ;
	}
	public void execute() {
		manager.requestElevator(destination, direction) ;
	}
}
