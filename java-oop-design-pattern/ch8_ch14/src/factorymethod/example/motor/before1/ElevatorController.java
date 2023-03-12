package factorymethod.example.motor.before1;

public class ElevatorController {
	private int id ;
	private int curFloor = 1;
	private LGMotor motor ;
	public ElevatorController(int id, LGMotor motor) {
		this.id = id ;
		this.motor = motor ;
	}
	public void gotoFloor(int destination) {
		if ( destination == curFloor ) return ;
		
		Direction direction ;
		if ( destination > curFloor )
			direction = Direction.UP ;
		else
			direction = Direction.DOWN ;
	
		motor.move(direction) ;
		
		System.out.print("Elevator [" + id + "] Floor: " + curFloor) ;
		curFloor = destination ;
		System.out.println(" ==> " + curFloor + " with " + motor.getClass().getName() ) ;
		
		motor.stop() ;
	}
}
