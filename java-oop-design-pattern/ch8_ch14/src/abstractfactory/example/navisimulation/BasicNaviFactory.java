package abstractfactory.example.navisimulation;

public class BasicNaviFactory extends NaviFactory {
	public GPS createGPS() {
		return new CheapGPS() ;
	}
	public Screen createMapScreen() {
		return new SDScreen() ;
	}
	public PathFinder createPathFinder() {
		return new SlowPathFinder() ;
	}
	public Map createMap() {
		return new SmallMap() ;
	}
}
