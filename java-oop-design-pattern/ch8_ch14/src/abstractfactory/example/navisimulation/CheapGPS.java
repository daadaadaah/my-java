package abstractfactory.example.navisimulation;

public class CheapGPS extends GPS {

	public Location findCurrentLocation() {
		System.out.println("find current location with Cheap GPS") ;
		return null;
	}

}
