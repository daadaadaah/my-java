package observer.example.elevatorcontroller;

public class Client {
	public static void main(String[] args) {
		ElevatorController controller = new ElevatorController() ;
		
		Observer elevatorDisplay = new ElevatorDisplay(controller) ;
		Observer voiceNotice = new VoiceNotice(controller) ;
		Observer floorDisplay = new FloorDisplay(controller) ;
		Observer controlRoomDisplay = new ControlRoomDisplay(controller) ;
		
		controller.attach(elevatorDisplay) ;
		controller.attach(voiceNotice) ;
		controller.attach(floorDisplay) ;
		controller.attach(controlRoomDisplay) ;
		
		controller.gotoFloor(5) ;
		controller.gotoFloor(10) ;	
	}
}