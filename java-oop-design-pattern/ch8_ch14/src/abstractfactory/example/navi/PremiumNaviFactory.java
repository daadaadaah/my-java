package abstractfactory.example.navi;

public class PremiumNaviFactory extends NaviFactory {
	public GPS createGPS() {
		return new ExpensiveGPS() ;
	}
	public Screen createScreen() {
		return new HDScreen() ;
	}
	public PathFinder createPathFinder() {
		return new FastPathFinder() ;
	}
	public Map createMap() {
		return new LargeMap() ;
	}
}
