package abstractfactory.example.navisimulation;

public class GPSSimulator extends GPS {
	public Location findCurrentLocation() {
		System.out.println("find current location with GPS Simulator") ;
		return null;
	}
}
