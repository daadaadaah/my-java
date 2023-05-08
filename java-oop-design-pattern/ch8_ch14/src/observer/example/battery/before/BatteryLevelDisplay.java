package observer.example.battery.before;

public class BatteryLevelDisplay  {
	private Battery battery ;
	public BatteryLevelDisplay(Battery battery) {
		this.battery = battery ;
	}
	public void update() {
		int level = battery.getLevel() ;
		System.out.println("Level: " + level) ;
	}
}
