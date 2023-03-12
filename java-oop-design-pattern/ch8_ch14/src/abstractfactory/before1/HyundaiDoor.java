package abstractfactory.before1;

public class HyundaiDoor extends Door {
	protected void doClose() {
		System.out.println("close Hyundai Door") ;		
	}
	protected void doOpen() {
		System.out.println("open Hyundai Door") ;
	}
}
