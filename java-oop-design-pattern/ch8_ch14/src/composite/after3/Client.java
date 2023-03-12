package composite.after3;

public class Client {
	public static void main(String[] args) {
		Body body = new Body() ;
		CPU cpu = new CPU(40, 30) ;
		MainMemory mainMemory = new MainMemory(30, 20) ;
		HardDisk hardDisk = new HardDisk(30, 20) ;
		
		body.addComponent(cpu) ;
		body.addComponent(mainMemory) ;
		body.addComponent(hardDisk) ;
				
		Computer computer = new Computer() ;
		Keyboard keyboard = new Keyboard(5, 2) ;
		Monitor monitor = new Monitor(20, 30) ;
		Speaker speaker = new Speaker(10, 10) ;

		computer.addComponent(body) ;
		computer.addComponent(keyboard) ;
		computer.addComponent(monitor) ;
		computer.addComponent(speaker) ;
		
		int computerPrice = computer.getPrice() ;
		int computerPower = computer.getPower() ;
		
		System.out.println("Computer Power: " + computerPower + " W") ;
		System.out.println("Computer Price: " + computerPrice + " ¸¸¿ø") ;	
	}
}
