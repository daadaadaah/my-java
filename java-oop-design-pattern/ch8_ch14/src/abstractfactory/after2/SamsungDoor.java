package abstractfactory.after2;

public class SamsungDoor extends Door {
	protected void doClose() {
		System.out.println("close Samsung Door") ;		
	}
	protected void doOpen() {
		System.out.println("open Samsung Door") ;
	}
}
