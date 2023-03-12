package abstractfactory.example.navisimulation;

public class PremiumNaviFactory extends NaviFactory {
	public GPS createGPS() {
		return new ExpensiveGPS() ;
	}
	public Screen createMapScreen() {
		return new HDScreen() ;
	}
	public PathFinder createPathFinder() {
		return new FastPathFinder() ;
	}
	public Map createMap() {
		return new LargeMap() ;
	}
}
