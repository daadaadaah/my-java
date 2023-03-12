package command.example.elevatorbutton;

public class Client {
	public static void main(String[] args) {
		ElevatorController controller1 = new ElevatorController(1) ;
		ElevatorController controller2 = new ElevatorController(2) ;

		ElevatorManager em = new ElevatorManager(2) ;
		em.addController(controller1) ;
		em.addController(controller2) ;
		
		// 1번 엘리베이터의 1층에 대한 목적지 층 버튼
		Command destinationCommand1stController = new DestinationSelectionCommand(1, controller1) ; 
		ElevatorButton destinationButton1stFloor = new ElevatorButton(destinationCommand1stController) ;
		destinationButton1stFloor.pressed() ;

		
		// 2번 엘리베이터의 2층에 대한 목적지 층 버튼
		Command destinationCommand2ndController = new DestinationSelectionCommand(2, controller2) ; 
		ElevatorButton destinationButton2ndFloor = new ElevatorButton(destinationCommand2ndController) ;
		destinationButton2ndFloor.pressed() ;
		
		// 2층에서 아래로 이동하기 위한 엘리베이터 요청 버튼 
		Command requestDownCommand = new ElevatorRequestCommand(2, Direction.DOWN, em) ;
		ElevatorButton requestDownFloorButton2ndFloor = new ElevatorButton(requestDownCommand) ;
		
		// 2층에서 아래방향으로의 요청 버튼을 선택함
		requestDownFloorButton2ndFloor.pressed() ;
	}
}
