package abstractfactory.example.navisimulation;

public class NaviTestFactory extends NaviFactory {
	public GPS createGPS() {
		return new GPSSimulator() ;
	}
	public Screen createMapScreen() {
		return new TestScreen() ;
	}
	public PathFinder createPathFinder() {
		return new TestPathFinder() ;
	}
	public Map createMap() {
		return new TestMap() ;
	}
}
