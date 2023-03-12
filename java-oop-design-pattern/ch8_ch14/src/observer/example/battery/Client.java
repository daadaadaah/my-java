package observer.example.battery;

public class Client {
	public static void main(String[] args) {
		Battery battery = new Battery() ;
		
		Observer batteryDisplay = new BatteryLevelDisplay(battery) ;
		Observer lowBatteryWarning = new LowBatteryWarning(battery) ;
		
		battery.attach(batteryDisplay) ;
		battery.attach(lowBatteryWarning) ;
		
		battery.consume(20) ;
		battery.consume(50) ;
		battery.consume(10) ;		
	}
}
